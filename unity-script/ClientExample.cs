using System;
using System.Collections;
using System.Collections.Generic;
using UnityEngine;
using WebSocketSharp;

[Serializable]
public class Item
{
    public float x;
    public float y;
    public float z;
}

public class ClientExample : MonoBehaviour
{

    private WebSocket ws;
    private Item item;

    private void Start()
    {
        ws = new WebSocket("ws://localhost:8080/ws");
        item = JsonUtility.FromJson<Item>("{ \"x\": 0, \"y\": 0, \"z\": 0 }");

        // 接続開始時のイベント.
        ws.OnOpen += (sender, e) =>
        {
            Debug.Log("Opended");
        };
        // メッセージ受信時のイベント.
        ws.OnMessage += (sender, e) =>
        {
            Debug.Log("Received " + e.Data);
            item = JsonUtility.FromJson<Item>(e.Data);
            Debug.Log(item.x+ ":" + item.y+ ":" + item.z);
        };
        // 接続.
        ws.Connect();

    }

    private void Update()
    {
        transform.Translate(item.x * 0.08f, item.y, item.z);

        if (Input.anyKey)
        {
            ws.Send("Unityから疎通テスト");
        }
    }

    private void OnDestroy()
    {
        ws.Close();
    }
}

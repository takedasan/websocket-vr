package jp.takeda.websocketvr.config.handler;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

import com.fasterxml.jackson.databind.ObjectMapper;

import jp.takeda.websocketvr.domain.model.Potision;

public class MessageHandler extends TextWebSocketHandler {

	private List<WebSocketSession> users;
	private Map<String, TextMessage> potisionMap;

	public MessageHandler() {
		this.users = new ArrayList<>();
		this.potisionMap = new HashMap<String, TextMessage>() {
			private static final long serialVersionUID = 6251858698178612762L;

			{
				// あ行
				put("001", new TextMessage("{\"id\":\"001\",\"top\":10,\"left\":50}"));
				put("002", new TextMessage("{\"id\":\"002\",\"top\":10,\"left\":100}"));
				put("003", new TextMessage("{\"id\":\"003\",\"top\":10,\"left\":150}"));
				put("004", new TextMessage("{\"id\":\"004\",\"top\":10,\"left\":200}"));
				put("005", new TextMessage("{\"id\":\"005\",\"top\":10,\"left\":250}"));
				// か行
				put("006", new TextMessage("{\"id\":\"006\",\"top\":60,\"left\":50}"));
				put("007", new TextMessage("{\"id\":\"007\",\"top\":60,\"left\":100}"));
				put("008", new TextMessage("{\"id\":\"008\",\"top\":60,\"left\":150}"));
				put("009", new TextMessage("{\"id\":\"009\",\"top\":60,\"left\":200}"));
				put("010", new TextMessage("{\"id\":\"010\",\"top\":60,\"left\":250}"));
				// さ行
				put("011", new TextMessage("{\"id\":\"011\",\"top\":110,\"left\":50}"));
				put("012", new TextMessage("{\"id\":\"012\",\"top\":110,\"left\":100}"));
				put("013", new TextMessage("{\"id\":\"013\",\"top\":110,\"left\":150}"));
				put("014", new TextMessage("{\"id\":\"014\",\"top\":110,\"left\":200}"));
				put("015", new TextMessage("{\"id\":\"015\",\"top\":110,\"left\":250}"));
				// た行
				put("016", new TextMessage("{\"id\":\"016\",\"top\":160,\"left\":50}"));
				put("017", new TextMessage("{\"id\":\"017\",\"top\":160,\"left\":100}"));
				put("018", new TextMessage("{\"id\":\"018\",\"top\":160,\"left\":150}"));
				put("019", new TextMessage("{\"id\":\"019\",\"top\":160,\"left\":200}"));
				put("020", new TextMessage("{\"id\":\"020\",\"top\":160,\"left\":250}"));
				
				// な行
				put("021", new TextMessage("{\"id\":\"021\",\"top\":210,\"left\":50}"));
				put("022", new TextMessage("{\"id\":\"022\",\"top\":210,\"left\":100}"));
				put("023", new TextMessage("{\"id\":\"023\",\"top\":210,\"left\":150}"));
				put("024", new TextMessage("{\"id\":\"024\",\"top\":210,\"left\":200}"));
				put("025", new TextMessage("{\"id\":\"025\",\"top\":210,\"left\":250}"));
				
				// は行
				put("026", new TextMessage("{\"id\":\"026\",\"top\":260,\"left\":50}"));
				put("027", new TextMessage("{\"id\":\"027\",\"top\":260,\"left\":100}"));
				put("028", new TextMessage("{\"id\":\"028\",\"top\":260,\"left\":150}"));
				put("029", new TextMessage("{\"id\":\"029\",\"top\":260,\"left\":200}"));
				put("030", new TextMessage("{\"id\":\"030\",\"top\":260,\"left\":250}"));
				
				// ま行
				put("031", new TextMessage("{\"id\":\"031\",\"top\":310,\"left\":50}"));
				put("032", new TextMessage("{\"id\":\"032\",\"top\":310,\"left\":100}"));
				put("033", new TextMessage("{\"id\":\"033\",\"top\":310,\"left\":150}"));
				put("034", new TextMessage("{\"id\":\"034\",\"top\":310,\"left\":200}"));
				put("035", new TextMessage("{\"id\":\"035\",\"top\":310,\"left\":250}"));
				
				// や行
				put("036", new TextMessage("{\"id\":\"036\",\"top\":360,\"left\":50}"));
				put("037", new TextMessage("{\"id\":\"037\",\"top\":360,\"left\":100}"));
				put("038", new TextMessage("{\"id\":\"038\",\"top\":360,\"left\":150}"));
				
				// ら行
				put("039", new TextMessage("{\"id\":\"039\",\"top\":420,\"left\":50}"));
				put("040", new TextMessage("{\"id\":\"040\",\"top\":420,\"left\":100}"));
				put("041", new TextMessage("{\"id\":\"041\",\"top\":420,\"left\":150}"));
				put("042", new TextMessage("{\"id\":\"042\",\"top\":420,\"left\":200}"));
				put("043", new TextMessage("{\"id\":\"043\",\"top\":420,\"left\":250}"));
				
				// わ行
				put("044", new TextMessage("{\"id\":\"044\",\"top\":470,\"left\":50}"));
				put("045", new TextMessage("{\"id\":\"045\",\"top\":470,\"left\":100}"));
				put("046", new TextMessage("{\"id\":\"046\",\"top\":470,\"left\":150}"));
				
				// が行
				put("047", new TextMessage("{\"id\":\"047\",\"top\":10,\"left\":350}"));
				put("048", new TextMessage("{\"id\":\"048\",\"top\":10,\"left\":400}"));
				put("049", new TextMessage("{\"id\":\"049\",\"top\":10,\"left\":450}"));
				put("050", new TextMessage("{\"id\":\"050\",\"top\":10,\"left\":500}"));
				put("051", new TextMessage("{\"id\":\"051\",\"top\":10,\"left\":550}"));
				
				// ざ行
				put("052", new TextMessage("{\"id\":\"052\",\"top\":60,\"left\":350}"));
				put("053", new TextMessage("{\"id\":\"053\",\"top\":60,\"left\":400}"));
				put("054", new TextMessage("{\"id\":\"054\",\"top\":60,\"left\":450}"));
				put("055", new TextMessage("{\"id\":\"055\",\"top\":60,\"left\":500}"));
				put("056", new TextMessage("{\"id\":\"056\",\"top\":60,\"left\":550}"));
				
				// だ行
				put("057", new TextMessage("{\"id\":\"057\",\"top\":110,\"left\":350}"));
				put("058", new TextMessage("{\"id\":\"058\",\"top\":110,\"left\":400}"));
				put("059", new TextMessage("{\"id\":\"059\",\"top\":110,\"left\":450}"));
				put("060", new TextMessage("{\"id\":\"060\",\"top\":110,\"left\":500}"));
				put("061", new TextMessage("{\"id\":\"061\",\"top\":110,\"left\":550}"));
				
				// ば行
				put("062", new TextMessage("{\"id\":\"062\",\"top\":160,\"left\":350}"));
				put("063", new TextMessage("{\"id\":\"063\",\"top\":160,\"left\":400}"));
				put("064", new TextMessage("{\"id\":\"064\",\"top\":160,\"left\":450}"));
				put("065", new TextMessage("{\"id\":\"065\",\"top\":160,\"left\":500}"));
				put("066", new TextMessage("{\"id\":\"066\",\"top\":160,\"left\":550}"));
				
				// ぱ行
				put("067", new TextMessage("{\"id\":\"067\",\"top\":210,\"left\":350}"));
				put("068", new TextMessage("{\"id\":\"068\",\"top\":210,\"left\":400}"));
				put("069", new TextMessage("{\"id\":\"069\",\"top\":210,\"left\":450}"));
				put("070", new TextMessage("{\"id\":\"070\",\"top\":210,\"left\":500}"));
				put("071", new TextMessage("{\"id\":\"071\",\"top\":210,\"left\":550}"));
				
				// 他
				put("072", new TextMessage("{\"id\":\"072\",\"top\":260,\"left\":350}"));
				put("073", new TextMessage("{\"id\":\"073\",\"top\":260,\"left\":400}"));
				put("074", new TextMessage("{\"id\":\"074\",\"top\":260,\"left\":450}"));
				put("075", new TextMessage("{\"id\":\"075\",\"top\":260,\"left\":500}"));
				put("076", new TextMessage("{\"id\":\"076\",\"top\":260,\"left\":550}"));
				put("077", new TextMessage("{\"id\":\"077\",\"top\":260,\"left\":550}"));
				
			}
		};
	}

	@Override
	public void afterConnectionEstablished(WebSocketSession session) throws Exception {
		if (this.users.stream().noneMatch(user -> user.getId().equals(session.getId()))) {
			this.users.add(session);
		}

		// 現在の各ひらがなの位置を同期させる
		for (Entry<String, TextMessage> entry : this.potisionMap.entrySet()) {
			session.sendMessage(entry.getValue());
		}
	}

	@Override
	public void handleTextMessage(WebSocketSession session, TextMessage message) {
		try {
			ObjectMapper mapper = new ObjectMapper();

			// 各ひらがなの位置情報をキャッシュ
			Potision potision = mapper.readValue(message.getPayload(), Potision.class);
			this.potisionMap.put(potision.getId(), message);

		} catch (Exception e) {
			e.printStackTrace();
		}

		this.users.stream().forEach(user -> {
			try {
				user.sendMessage(message);
			} catch (IOException ex) {
				System.out.println(ex.getLocalizedMessage());
			}
		});
	}

	@Override
	public void afterConnectionClosed(WebSocketSession session, CloseStatus status) throws Exception {
		this.users.stream().filter(user -> user.getId().equals(session.getId())).findFirst()
				.ifPresent(user -> this.users.remove(user));
	}
}
package google.com.br.fcm.sender;

import org.json.JSONObject;

public class Message {
	
	private String token;
	
	public Message(String token) {
		this.token = token;
	}
	
	public JSONObject getMessage() {
		
		JSONObject alert = new JSONObject();
		
		JSONObject notification = new JSONObject();
		
		notification.put("title", "Alert Testing");
		
		notification.put("body", "Notification de Testing");
		
		alert.put("notification", notification);
		
		alert.put("to", token);
		
		return alert;
	}
}

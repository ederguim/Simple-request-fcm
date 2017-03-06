package google.com.br.fcm.sender;

import org.json.JSONObject;

public class Message {
	
	public JSONObject getMessage() {
		
		JSONObject notificacao = new JSONObject();
		
		JSONObject data = new JSONObject();
		
		data.put("message", "mensagem de teste");
		
		notificacao.put("data", data);
		
		return notificacao;
	}
}

package google.com.br.fcm.sender;

import java.io.IOException;

import org.apache.http.HttpResponse;
import org.apache.http.entity.StringEntity;

public class SenderTopic {
	
	private static String topic = "/topics/...";
	private static String token = "to";

	// Envio realizado pelo topico criado para o app.

	public static void mainTopic(String[] args) {
		
		try {
			
			Sender sender = new Sender();
			
			sender.getHttpPost().setEntity(new StringEntity(new Message().getMessage().put(token, topic).toString()));
			
			HttpResponse response = sender.getHttpClient().execute(sender.getHttpPost());
			
			System.out.println(response.getEntity());
		
		} catch (IOException e) {
		
			e.printStackTrace();
		}
	}
}

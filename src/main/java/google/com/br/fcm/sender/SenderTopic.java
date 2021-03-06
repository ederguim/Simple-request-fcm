package google.com.br.fcm.sender;

import java.io.IOException;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;

public class SenderTopic {
	
	private static String token = "/topics/fism-topic";

	// Envio realizado pelo topico criado para o app.

	public static void main(String[] args) {
		
		try {
			
			Sender sender = new Sender();
			
			HttpClient client = sender.getHttpClient();
			
			HttpPost post = sender.getHttpPost();
			
			String message = new Message(token).getMessage().toString();
			
			post.setEntity(new StringEntity(message));
			
			HttpResponse response = client.execute(post);
			
			System.out.println(response.getStatusLine().getStatusCode());
		
		} catch (IOException e) {
		
			e.printStackTrace();
		}
	}
}

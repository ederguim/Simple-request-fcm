package google.com.br.fcm.sender;

import java.io.IOException;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.json.JSONObject;

public class Sender {

	private static String url = "https://fcm.googleapis.com/fcm/send";
	private static String keySenderID = "AIzaSy...";
	private static String keyServer = "AAAAAMRSnDM:...";
	private static String topic = "/topics/...";
	
	//Envio realizado pelo senderID do aparelho

	public static void mainkeyLegacyServer(String[] args) {
		try {

			HttpClient client = HttpClientBuilder.create().build();
			HttpPost post = new HttpPost(url);
			JSONObject notificacao = new JSONObject();
			JSONObject data = new JSONObject();

			post.setHeader("Content-type", "application/json");
			post.setHeader("Authorization", "key=" + keyServer);

			notificacao.put("to", keySenderID);
			data.put("message", "mensagem de teste");
			notificacao.put("data", data);

			StringEntity stringEntity = new StringEntity(notificacao.toString());
			
			post.setEntity(stringEntity);
			
			System.out.println(stringEntity);
			
			HttpResponse response = client.execute(post);
			
			System.out.println(response.getEntity());
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	
	
	//Envio realizado pelo topico criado para o app.
	
	public static void mainTopic(String[] args) {
		try {

			HttpClient client = HttpClientBuilder.create().build();
			HttpPost post = new HttpPost(url);
			JSONObject notificacao = new JSONObject();
			JSONObject data = new JSONObject();

			post.setHeader("Content-type", "application/json");
			post.setHeader("Authorization", "key=" + keyServer);

			notificacao.put("to", topic);
			data.put("message", "mensagem de teste");
			notificacao.put("data", data);

			StringEntity stringEntity = new StringEntity(notificacao.toString());
			
			post.setEntity(stringEntity);
			
			System.out.println(stringEntity);
			
			HttpResponse response = client.execute(post);
			
			System.out.println(response.getEntity());
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}

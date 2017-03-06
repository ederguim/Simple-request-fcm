package google.com.br.fcm.sender;

import java.io.IOException;

import org.apache.http.HttpResponse;
import org.apache.http.entity.StringEntity;

public class SenderKeySenderID {

	private static String keySenderID = "AIzaSy...";
	private static String token = "to";

	// Envio realizado pelo senderID do aparelho

	public static void main(String[] args) {
		
		try {

			Sender sender = new Sender();

			sender.getHttpPost().setEntity(new StringEntity(new Message().getMessage().put(token, keySenderID).toString()));

			HttpResponse response = sender.getHttpClient().execute(sender.getHttpPost());

			System.out.println(response.getEntity());

		} catch (IOException e) {

			e.printStackTrace();
		}
	}
}

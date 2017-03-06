package google.com.br.fcm.sender;

import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.HttpClientBuilder;

public class Sender {

	private static String url = "https://fcm.googleapis.com/fcm/send";
	private static String keyServer = "AAAAAMRSnDM:...";

	public HttpClient getHttpClient() {
		HttpClient client = HttpClientBuilder.create().build();
		return client;
	}

	public HttpPost getHttpPost() {
		HttpPost post = new HttpPost(url);
		post.setHeader("Content-type", "application/json");
		post.setHeader("Authorization", "key=" + keyServer);
		return post;
	}

}

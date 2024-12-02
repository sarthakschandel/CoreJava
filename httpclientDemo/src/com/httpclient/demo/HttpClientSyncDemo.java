package com.httpclient.demo;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpHeaders;
import java.net.http.HttpRequest;
import java.net.http.HttpRequest.BodyPublishers;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

public class HttpClientSyncDemo {

	public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException {

		// isme sabkuch hai
		HttpClient client = HttpClient.newHttpClient();
		HttpRequest request = HttpRequest.newBuilder(new URI("http://fakerestapi.azurewebsites.net/api/v1/activities/"))
				.GET().build();

		request = HttpRequest.newBuilder(new URI("http://fakerestapi.azurewebsites.net/api/v1/activities/"))
				.POST(BodyPublishers.ofString("{\n" + " \"ID\":0,\n" + " \"Title\":\"string\",\n"
						+ " \"DueDate\":\"2020-06-24T08:32:49.249Z\",\n" + " \"Completed\": true\n" + "}"))
				.header("Content-Type", "application/json").build();
		// v1 add kiya hai maine URI mein varna chal nahi raha tha
		// also java 21 set kiya hai execution environment mein :)

		HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
		System.out.println("Status===>" + response.statusCode());
		System.out.println(response.body());

		HttpHeaders headers = response.headers();
		System.out.println(headers.map());

	}

}

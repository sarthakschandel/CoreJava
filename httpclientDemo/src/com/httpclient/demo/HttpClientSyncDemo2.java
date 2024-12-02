package com.httpclient.demo;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpRequest.BodyPublishers;
import java.net.http.HttpResponse.BodyHandlers;

public class HttpClientSyncDemo2 {

	public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException {

		HttpClient client = HttpClient.newHttpClient();// step1. create HHTPClient Object
		HttpRequest request = HttpRequest.newBuilder(new URI("http://fakerestapi.azurewebsites.net/api/v1/activities/"))
				.GET().build();// step2. create HTTPRequest Object

		request = HttpRequest.newBuilder(new URI("http://fakerestapi.azurewebsites.net/api/v1/activities/"))
				.POST(BodyPublishers.ofString("{\n" + " \"ID\":0,\n" + " \"Title\":\"string\",\n"
						+ " \"DueDate\":\"2020-06-24T08:32:49.249Z\",\n" + " \"Completed\": true\n" + "}"))
				.header("Content-Type", "application/json").build();
		// creating a POST request
		// using header to specify the content type

		HttpResponse<String> response = client.send(request, BodyHandlers.ofString());// step3. send the request
		System.out.println("Status===>" + response.statusCode());// step4. process the response
		System.out.println(response.body());

	}

}

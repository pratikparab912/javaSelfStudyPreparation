package com.cybage.java11;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpClient.Version;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.nio.file.Files;
import java.nio.file.Path;

public class TestJava11Features {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		//TestJava11Features.myFile();
		TestJava11Features.demoHttpClient();
	}
	public static void myFile() throws IOException {
		Path path = Files.writeString(Files.createTempFile("test", ".txt"), "This is content for File");
		System.out.println(path);
		String fileContent = Files.readString(path);
		System.out.println(fileContent);
	}
	public static void demoHttpClient() throws IOException, InterruptedException {
		//java.net.http package Introduced in java 9. Now its standard in Java11
		String uri = "https://catfact.ninja/fact";
		HttpRequest request = HttpRequest.newBuilder()
				.uri(URI.create(uri))
				.GET()
				.version(Version.HTTP_2)
				.build();
		HttpClient httpClient = HttpClient.newBuilder()
								.build();
		HttpResponse<String> response = httpClient.send(request,BodyHandlers.ofString());
		System.out.println(response.statusCode());
		System.out.println(response.body());
				
	}
}

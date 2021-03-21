package com.springboot.moviemoon.requesthttp;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletionException;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ClientHttp {
/*	
	public List<Map<String,String>> getDataJson() {
		URI endpoint=URI.create("https://jsonplaceholder.typicode.com/albums");
		   HttpClient client = HttpClient.newHttpClient();
		   HttpRequest request =HttpRequest.newBuilder().
				                uri(endpoint).
				                header("Accept", "application/json").build();
		  try {
		   HttpResponse<Stream<String>> response =
			          client.send(request, BodyHandlers.ofLines());
		   List<String> body=response.body().collect(Collectors.toList());
		   List<Map<String,String>> convertToJson = new ArrayList();
		   UncheckedObjectMapper mapper= new UncheckedObjectMapper();
		   body.forEach(e -> convertToJson.add(mapper.readValue(e)));
		   //System.out.println(body);
		   //Map<String,String> convertToJson= new UncheckedObjectMapper().readValue(body);
		   //System.out.println(convertToJson);
		   return convertToJson;
		  }catch(Exception e) {
			  System.out.print(e.getMessage());
			  return null;
		  }
		
	}
*/
	public List<Map<String,String>> getDataJson() {
		URI endpoint=URI.create("https://jsonplaceholder.typicode.com/albums");
		   HttpClient client = HttpClient.newHttpClient();
		   HttpRequest request =HttpRequest.newBuilder().
				                uri(endpoint).
				                header("Accept", "application/json").build();
		  try {
		   HttpResponse<String> response =
			          client.send(request, BodyHandlers.ofString());
		   String body=response.body();
		   System.out.print(body);
		   return null;
		  }catch(Exception e) {
			  System.out.print(e.getMessage());
			  return null;
		  }
	}
}
class UncheckedObjectMapper extends ObjectMapper {
    /** Parses the given JSON string into a Map. */
    Map<String,String> readValue(String content) {
    try {
        return this.readValue(content, new TypeReference<>(){});
    } catch (IOException ioe) {
        throw new CompletionException(ioe);
    }
    }
}

package edu.escuelaing.arep.SparkWebServer;

import okhttp3.*;

import java.io.IOException;


public class HTTPClient {

    private OkHttpClient httpClient;
    private String url="http://172.17.0.1";
    private String[] ports={":35001",":35002",":35003"};
    public static final MediaType JSON = MediaType.parse("application/json; charset=utf-8");
    private int serverNumber=0;

    public HTTPClient(){
        httpClient=new OkHttpClient();
    }

    public String getMessages() throws IOException {
        Request request = new Request.Builder().url(url+ports[serverNumber]+"/result").get().build();
        System.out.println("GET: "+url+ports[serverNumber]+"/result");
        Response response = httpClient.newCall(request).execute();
        return response.body().string();
    }

    public String postMessage(String message) throws IOException {
        RequestBody body = RequestBody.create(message,JSON);
        Request request = new Request.Builder().url(url+ports[serverNumber]+"/result")
                .post(body)
                .build();
        System.out.println("POST: "+url+ports[serverNumber]+"/result");
        Response response = httpClient.newCall(request).execute();
        return response.body().string();
    }

    public void roundRobin(){
        this.serverNumber=(this.serverNumber+1)% ports.length;
    }
}
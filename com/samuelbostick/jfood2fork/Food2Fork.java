package com.samuelbostick.jfood2fork;

import com.owlike.genson.Genson;
import com.owlike.genson.GensonBuilder;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class Food2Fork {
    private String _apiKey;

    public Food2Fork(String apiKey){
        _apiKey = apiKey;
    }

    public Recipe getRecipe(int id) throws IOException{
        String json = getJsonFromUrl("http://food2fork.com/api/get?key=" + _apiKey + "&rId=" + id);
        Genson genson = new GensonBuilder().useRuntimeType(true).create();
        return genson.deserialize(json, RecipeContainer.class).recipe;
    }

    public SearchResult search(String query, char sort, int page) throws MalformedURLException, IOException{
        String json = getJsonFromUrl("http://food2fork.com/api/search?key=" + _apiKey
                + "&q=" + query + "&sort=" + sort + "&page=" + page);
        Genson genson = new GensonBuilder().useRuntimeType(true).create();
        return genson.deserialize(json, SearchResult.class);
    }

    private String getJsonFromUrl(String s) throws IOException{
        HttpURLConnection urlConnection = null;
        String json = "";
        try{
            URL url = new URL(s);
            urlConnection = (HttpURLConnection) url.openConnection();
            InputStreamReader reader = new InputStreamReader(url.openStream());

            int d = reader.read();
            while(d != -1){
                json += (char)d;
                d = reader.read();
            }
        }catch(IOException e){
            throw new IOException("There was an error reading from the url. Check your parameters, and that the endpoint is online.");
        }finally{
            if(urlConnection != null){
                urlConnection.disconnect();
            }
        }

        return json;
    }
}

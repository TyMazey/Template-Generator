package main.com.quickstart.Services;

import kong.unirest.HttpResponse;
import kong.unirest.JsonNode;
import kong.unirest.Unirest;
import kong.unirest.json.JSONObject;
import main.com.quickstart.Models.User;


public class GithubService {

    public static String verify(String code){

        System.out.println(code);
        HttpResponse<JsonNode> response = Unirest.post("https://github.com/login/oauth/access_token")
                .header("accept", "application/json")
                .field("client_id", "a8e1ac06db03b1b38fff")
                .field("client_secret", "8e0933cc5cd37419ce3e3d5c9b98193d573292c9")
                .field("code", code)
                .asJson();
        Unirest.shutDown();

        if(response.isSuccess()) {
            JSONObject JSONData = response.getBody().getObject();
            String userToken = JSONData.getString("access_token");
            return  userToken;
        }else{
            return null;
        }
    }


    public static User getUserData(String token, String username){
        HttpResponse<JsonNode> response = Unirest.get("https://api.github.com/users/{username}")
                .routeParam("username", username)
                .queryString("access_token", token)
                .asJson();
        Unirest.shutDown();

        if(response.isSuccess()){
            JSONObject JSONData = response.getBody().getObject();
            return new User(JSONData.getString("login"), JSONData.getString("email"));
        }else{
            return null;
        }
    }
}

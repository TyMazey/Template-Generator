package main.com.quickstart.Models;

import main.com.quickstart.Services.GithubService;

import java.util.ArrayList;

public class TemplateForm {

    public String coAuthor1;
    public String coAuthor3;
    public String coAuthor2;


    public TemplateForm(String coAuthor1, String coAuthor3, String coAuthor2) {
        this.coAuthor1 = coAuthor1;
        this.coAuthor3 = coAuthor3;
        this.coAuthor2 = coAuthor2;
    }

    public ArrayList<User> getUserData(String token){
        String[] usernames = getAll();
        ArrayList<User> users = new ArrayList<User>();
        for(int i = 0; i < usernames.length; i++){
           users.add(GithubService.getUserData(token, usernames[i]));
        }
        return users;
    }

    public String[] getAll(){
        String all[] = {getCoAuthor1(), getCoAuthor2(), getCoAuthor3()};
        return all;
    }

    public String getCoAuthor1() {
        return coAuthor1;
    }

    public void setCoAuthor1(String coAuthor1) {
        this.coAuthor1 = coAuthor1;
    }

    public String getCoAuthor3() {
        return coAuthor3;
    }

    public void setCoAuthor3(String coAuthor3) {
        this.coAuthor3 = coAuthor3;
    }

    public String getCoAuthor2() {
        return coAuthor2;
    }

    public void setCoAuthor2(String coAuthor2) {
        this.coAuthor2 = coAuthor2;
    }
}

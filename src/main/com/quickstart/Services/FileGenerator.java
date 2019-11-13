package main.com.quickstart.Services;
import main.com.quickstart.Models.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileGenerator {

    public static List<String> newFile(ArrayList<User> users){
        ArrayList<String> data = new ArrayList<String>(Arrays.asList("# Title",
                "#What the commit solves",
                "#What was changed to address the above",
                "#Project Card Url(Optional)", ""));
        for(int i = 0; i < users.size(); i++){
            String input = "Co-authored-by: " + users.get(i).getName() + " <" + users.get(i).getEmail() + ">";
            data.add(input);
        }
        return data;
    }
}

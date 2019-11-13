package main.com.quickstart.Models;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileGenerator {

    public static List<String> newFile(ArrayList<User> users){
        List<String> data = Arrays.asList("# Title",
                "#What the commit solves",
                "#What was changed to address the above",
                "#Project Card Url(Optional)", "");
        for(int i = 0; i < users.size(); i++){
            data.add("Co-authored-by: "+ users.get(i).getName() +"<"+ users.get(i).getEmail() +">");
        }
        return data;
    }
}

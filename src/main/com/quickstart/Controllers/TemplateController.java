package main.com.quickstart.Controllers;

import main.com.quickstart.Services.FileGenerator;
import main.com.quickstart.Models.User;
import main.com.quickstart.Services.GithubService;
import main.com.quickstart.Web.CookieManager;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Controller
public class TemplateController {

    @RequestMapping(value = "/template-submit", method = RequestMethod.POST, consumes = {"application/x-www-form-urlencoded"})
    public String submitTemplate(Model model, @RequestParam HashMap<String, Object> FormData, HttpServletRequest request){
        String token = CookieManager.getCookie(request, "access_token");
        ArrayList<User> coAuthors = GithubService.getCoAuthors(FormData.values(), token);
        List<String> downloadFile = FileGenerator.newFile(coAuthors);
        model.addAttribute("template", downloadFile);
        return "template-download";
    }



}

package main.com.quickstart.Controllers;

import main.com.quickstart.Services.GithubService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

@Controller
public class WelcomeController {


    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String welcome(Model model){
        model.addAttribute("client_id", "a8e1ac06db03b1b38fff");
        return "index";
    }

    @RequestMapping(value = "/callback", method = RequestMethod.GET)
    public String callback(@RequestParam(value="code", required=false) String code, Model model, HttpServletResponse response){
        String userToken = GithubService.verify(code);
        if(userToken != null){
            Cookie authCookie = new Cookie("access_token", userToken);
            authCookie.setMaxAge(60*60);
            response.addCookie(authCookie);
            return "template-generator";

        }else{
            model.addAttribute("client_id", "a8e1ac06db03b1b38fff");
            return "index";
        }
    }
}
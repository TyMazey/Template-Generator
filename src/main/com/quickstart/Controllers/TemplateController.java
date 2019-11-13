package main.com.quickstart.Controllers;

import main.com.quickstart.Models.FileGenerator;
import main.com.quickstart.Models.TemplateForm;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Controller
public class TemplateController {

    @RequestMapping(value = "/template-submit", method = RequestMethod.POST, consumes = {"application/x-www-form-urlencoded"})
    public String submitTemplate(Model model, @RequestParam HashMap<String, Object> FormData, HttpServletRequest request){
        System.out.println(request.getCookies());
        TemplateForm template = new TemplateForm("s", "s", "s");
        List<String> downloadFile = FileGenerator.newFile(template.getUserData("token"));
        model.addAttribute("template", downloadFile);
        return "template-download";
    }
}

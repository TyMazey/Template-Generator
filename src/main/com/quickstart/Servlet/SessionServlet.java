package main.com.quickstart.Servlet;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

@WebServlet(
        name = "SessionServlet",
        urlPatterns = "/template-generator"
)
public class SessionServlet extends HttpServlet {


}

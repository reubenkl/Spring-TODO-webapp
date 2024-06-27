package com.reuben.springboot.TodoWebApp.welcome;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class welcomeController {

    @RequestMapping("/welcome")
    public String welcome(){
        return "welcome";
    }

    @RequestMapping("/say-hello")
    @ResponseBody
    public String sayHello(){
        return "Hello! What are you learning today?";
    }

    @RequestMapping("/say-hello-html")
    @ResponseBody
    public String sayHelloHtml(){
        StringBuffer sb = new StringBuffer();
        sb.append("<html>");
        sb.append("<head>");
        sb.append("<title>");
        sb.append("MySayHelloPage");
        sb.append("</title>");
        sb.append("</head>");
        sb.append("<body>");
        sb.append("<h1>");
        sb.append("How are you? From Body");
        sb.append("</h1>");
        sb.append("</body>");
        sb.append("</html>");
        return sb.toString();
    }
}

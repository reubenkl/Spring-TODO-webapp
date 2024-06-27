package com.reuben.springboot.TodoWebApp.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    private AuthenticationService authService;

    public LoginController(AuthenticationService authService){
        this.authService = authService;
    }

    @RequestMapping(value="login", method= RequestMethod.GET)
    public String loginGet(){
        return "login";
    }

    @RequestMapping(value="login", method= RequestMethod.POST)
    public String loginPost(@RequestParam String name, @RequestParam String password, ModelMap model){
        if(authService.authenticateUser(name, password)){
            model.put("name", name);
            model.put("password", password);
            return "welcome";
        }else {
            model.put("error", "AUTHENTICATION FAILED");
            return "login";
        }
    }
}

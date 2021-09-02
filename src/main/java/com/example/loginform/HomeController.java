package com.example.loginform;

import com.example.loginform.model.Login;
import com.example.loginform.service.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {

    @Autowired
    private HomeService homeService;

    @GetMapping("/")
    public String index(Model model){

        model.addAttribute("login", new Login());

        return "index";
    }

    @GetMapping("/info")
    public String info(Model model){

        model.addAttribute("users",  homeService.getUsers());

        return "/info";
    }

    @PostMapping("/info")
    public String loginInfo(Model model, @ModelAttribute Login login){

        String loginName =  login.getName();
        String description = "My name is "+ loginName + " and I am a IT Developer @ Get me Hired";

        model.addAttribute("users",  homeService.loginUsers(loginName, description));

        return "info";
    }

}


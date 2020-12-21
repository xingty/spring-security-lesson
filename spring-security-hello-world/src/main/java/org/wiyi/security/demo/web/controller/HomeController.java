package org.wiyi.security.demo.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class HomeController {

    @GetMapping("/home")
    public String home() {
        return "home";
    }

    @GetMapping("/user")
    public String users(ModelMap map) {
        List<String> users = Arrays.asList("user1","user2","user3");
        map.addAttribute("users",users);
        return "user";
    }
}

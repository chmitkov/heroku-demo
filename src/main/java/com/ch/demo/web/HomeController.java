package com.ch.demo.web;

import com.ch.demo.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    private final UserService userService;

    public HomeController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public String index(Model model){
        model.addAttribute("users", userService.findAllUser());

        return "index";
    }
}

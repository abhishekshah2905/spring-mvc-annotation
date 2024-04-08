package com.spring.mvc.annotation.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Slf4j
@Controller
@RequestMapping("/")
public class HomeController {
    @RequestMapping(method = RequestMethod.GET)
    public String index(Model model) {
        log.info("index()");
        model.addAttribute("msg", "Welcom to the Spring MVC Application!!!");
        return "index";
    }
}

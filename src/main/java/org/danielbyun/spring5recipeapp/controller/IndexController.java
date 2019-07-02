package org.danielbyun.spring5recipeapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
    @RequestMapping({"", "/", "/index"})
    public String getIndexPage() {
        return "index";
    }

    @RequestMapping("/hello")
    public String helloPage() {
        return "hello";
    }
}

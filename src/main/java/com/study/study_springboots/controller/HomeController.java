package com.study.study_springboots.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController { // http://localhost:8080/home
    @RequestMapping(value = { "", "/", "/main" })
    public String main() {
        int i = 0;
        return "WEB-INF/views/main.jsp";
    }

    @RequestMapping(value = "/home")
    public void home() {
        int i = 0;
    }

    @RequestMapping(value = "/homejsp")
    public String homejsp() {
        int i = 0;
        return "WEB-INF/views/home.jsp";
    }

    @RequestMapping(value = "/homehtml")
    public String homehtml() {
        int i = 0;
        return "WEB-INF/views/home.html";
    }

}

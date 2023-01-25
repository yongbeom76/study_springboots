package com.study.study_springboots.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.study.study_springboots.dao.HomeDao;

@Controller
public class HomeController { // http://localhost:8080/home

    @Autowired
    HomeDao homeDao;

    @RequestMapping(value = { "", "/", "/main" })
    public String main() {
        int i = 0;
        return "main";
    }

    @RequestMapping(value = "/home")
    public void home() {
        Object result = homeDao.getList();
        int i = 0;
    }

    @RequestMapping(value = "/homejsp")
    public String homejsp() {
        int i = 0;
        return "home";
    }

    @RequestMapping(value = "/homehtml")
    public String homehtml() {
        int i = 0;
        return "home.html";
    }

    @RequestMapping(value = "/jstlformats")
    public String jstlformats() {
        int i = 0;
        return "jstl_formats";
    }

}

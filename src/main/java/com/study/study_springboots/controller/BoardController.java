package com.study.study_springboots.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class BoardController {
    @RequestMapping(value = "/board/form", method = RequestMethod.GET)
    public String form() {
        return "/WEB-INF/views/board/form.jsp";
    }

    // form tag통해서 content를 작성해서 날린 경우 post로 날라온다. 그 데이타를 받아와라.
    @RequestMapping(value = "/board/form", method = RequestMethod.POST)
    public String formPost() {
        // insert biz
        return "/WEB-INF/views/board/list.jsp";
    }

    @RequestMapping(value = { "/board", "/board/list" })
    public String board() {
        return "/WEB-INF/views/board/list.jsp";
    }

    @RequestMapping(value = "/board/view")
    public String view() {
        return "/WEB-INF/views/board/view.jsp";
    }

    @RequestMapping(value = "/board/edit")
    public String edit() {
        return "/WEB-INF/views/board/edit.jsp";
    }
}

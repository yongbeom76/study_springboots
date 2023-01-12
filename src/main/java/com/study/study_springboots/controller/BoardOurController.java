package com.study.study_springboots.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.study.study_springboots.beans.BoardBean;
import com.study.study_springboots.service.DataInfors;

// +Read:list.jsp(/board) -> view.jsp(/board_our/view) -> list.jsp(/board_our/list)
// +Create:list.jsp(/board) -> form.jsp(/board_our/form) ->list.jsp(/board_our/save) with post -> list.jsp(/board_our/list)
// +Update:view.jsp(/board_our/view) -> edit.jsp(/board_our/edit).jsp -> list.jsp(/board_our/save)
@Controller
@RequestMapping(value = "/board_our")
public class BoardOurController {
    @RequestMapping(value = "/edit", method = RequestMethod.POST) // "/board_our"
    public String edit() {
        return "board_our/edit";
    }

    @RequestMapping(value = { "/", "/list" }, method = RequestMethod.GET)
    public ModelAndView list() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("firstString", "firstValue");
        DataInfors dataInfors = new DataInfors();
        ArrayList<BoardBean> boardList = dataInfors.getDataListWithBoardBean();
        modelAndView.addObject("boardList", boardList);
        modelAndView.setViewName("board_our/list");
        return modelAndView; // --> Dispatcher Servlet
    }

    @RequestMapping(value = "/view", method = RequestMethod.GET)
    public ModelAndView view(ModelAndView modelAndView) {
        DataInfors dataInfors = new DataInfors();
        BoardBean boardBean = dataInfors.getDataWithBoardBean();
        modelAndView.addObject(boardBean);
        modelAndView.setViewName("board_our/view");
        return modelAndView;
    }

    @RequestMapping(value = "/form", method = RequestMethod.GET)
    public ModelAndView form(ModelAndView modelAndView) {
        modelAndView.setViewName("board_our/form");
        return modelAndView;
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public ModelAndView save(ModelAndView modelAndView) {
        // insert biz
        modelAndView.setViewName("board_our/list");
        return modelAndView;
    }

}

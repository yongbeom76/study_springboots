package com.study.study_springboots.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.study.study_springboots.beans.BoardBean;
import com.study.study_springboots.service.DataInfors;

@Controller
@RequestMapping(value = "/notice")
public class NoticeController {
    @GetMapping("/")
    public ModelAndView list(ModelAndView modelAndView) {
        DataInfors dataInfors = new DataInfors();
        List<BoardBean> boardList = dataInfors.getBoard();
        modelAndView.addObject("boardList", boardList);
        modelAndView.setViewName("notice/list");
        return modelAndView;
    }

    @GetMapping("/edit/{title}")
    public ModelAndView edit(@PathVariable String title, ModelAndView modelAndView) {
        DataInfors dataInfors = new DataInfors();
        BoardBean boardBean = dataInfors.getBean(title);
        modelAndView.addObject("boardBean", boardBean);
        modelAndView.setViewName("notice/edit");
        return modelAndView;
    }

    @PostMapping("/view")
    public ModelAndView view(@RequestParam HashMap<String, String> params, ModelAndView modelAndView) {
        modelAndView.addObject("params", params);
        modelAndView.setViewName("notice/view");
        return modelAndView;
    }
}

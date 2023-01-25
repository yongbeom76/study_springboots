package com.study.study_springboots.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.study.study_springboots.dao.CommonCodeDaoJinsu;

@Controller
@RequestMapping("/commonCodeJinsu")
public class CommonCodeControllerJinsu {

    @Autowired
    CommonCodeDaoJinsu codeDao;

    @RequestMapping("/list")
    public ModelAndView list(ModelAndView modelAndView) {
        Object list = codeDao.getList();
        modelAndView.addObject("lists", list);
        modelAndView.setViewName("/commonCode/listJinsu");
        return modelAndView;
    }
}

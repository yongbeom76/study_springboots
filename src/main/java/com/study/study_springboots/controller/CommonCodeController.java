package com.study.study_springboots.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.study.study_springboots.dao.CommonCodeDao;

@Controller
@RequestMapping("/commonCode")
public class CommonCodeController {

    @Autowired
    CommonCodeDao commonCodeDao;

    @GetMapping({ "/", "list", "" })
    public ModelAndView list(@RequestParam Map<String, Object> params, ModelAndView modelAndView) {
        Object resultMap = commonCodeDao.getList();
        modelAndView.addObject("resultMap", resultMap);
        modelAndView.setViewName("/commonCode/list");
        return modelAndView;
    }
}

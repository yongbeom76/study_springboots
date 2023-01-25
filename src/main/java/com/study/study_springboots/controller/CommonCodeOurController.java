package com.study.study_springboots.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.study.study_springboots.service.CommonCodeOurService;

@Controller
@RequestMapping(value = "/commonCodeOur")
public class CommonCodeOurController {

    @Autowired
    CommonCodeOurService commonCodeOurService;

    @PostMapping("/insert")
    public ModelAndView insert(@RequestParam Map<String, Object> params, ModelAndView modelAndView) {
        commonCodeOurService.insertOne(params);
        modelAndView.setViewName("commonCode_our/list");
        return modelAndView;
    }

    @GetMapping("/form")
    public ModelAndView form(@RequestParam Map<String, Object> params, ModelAndView modelAndView) {
        modelAndView.setViewName("commonCode_our/edit");
        return modelAndView;
    }

    @PostMapping("/delete/{uniqueId}")
    public ModelAndView delete(@RequestParam Map<String, Object> params, @PathVariable String uniqueId,
            ModelAndView modelAndView) {
        params.put("COMMON_CODE_ID", uniqueId);
        Object resultMap = commonCodeOurService.deleteAndGetList(params);
        modelAndView.addObject("resultMap", resultMap);
        modelAndView.setViewName("commonCode_our/list");
        return modelAndView;
    }

    @RequestMapping(value = {"/deleteMulti"}, method = RequestMethod.POST)
    public ModelAndView deleteMulti(HttpServletRequest httpServletRequest, @RequestParam Map<String, Object> params, @PathVariable String uniqueId
                    , ModelAndView modelAndView) {
                        
        // modelAndView.addObject("resultMap", resultMap);
        String[] deleteMultis = httpServletRequest.getParameterMap().get("COMMON_CODE_ID");

        modelAndView.setViewName("commonCode_our/list");
        return modelAndView;
    }

    @PostMapping("/update")
    public ModelAndView update(@RequestParam Map<String, Object> params, ModelAndView modelAndView) {
        Object resultMap = commonCodeOurService.updateAndGetList(params);
        modelAndView.addObject("resultMap", resultMap);
        modelAndView.setViewName("commonCode_our/list");
        return modelAndView;
    }

    // @RequestMapping(value ="/list",method = RequestMethod.GET)
    @GetMapping({ "/list", "/", "" })
    public ModelAndView list(@RequestParam Map<String, Object> params, ModelAndView modelAndView) {
        Object resultMap = commonCodeOurService.getList(params);
        modelAndView.addObject("resultMap", resultMap);
        modelAndView.setViewName("commonCode_our/list");
        return modelAndView;
    }

    @GetMapping("/edit/{uniqueId}")
    public ModelAndView edit(@RequestParam Map<String, Object> params, @PathVariable String uniqueId,
            ModelAndView modelAndView) {
        params.put("COMMON_CODE_ID", uniqueId);
        Object resultMap = commonCodeOurService.getOne(params);
        modelAndView.addObject("resultMap", resultMap);
        modelAndView.setViewName("commonCode_our/edit");
        return modelAndView;
    }
}

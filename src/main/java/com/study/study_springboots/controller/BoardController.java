package com.study.study_springboots.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.study.study_springboots.beans.BoardBean;
import com.study.study_springboots.service.DataInfors;

@Controller
@RequestMapping(value = "/board")
public class BoardController {
    @RequestMapping(value = "/form", method = RequestMethod.GET)
    public String form() {
        return "board/form";
    }

    // form tag통해서 content를 작성해서 날린 경우 post로 날라온다. 그 데이타를 받아와라.
    // 새로운 글 저장
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public ModelAndView formPost(@RequestParam String userName, @RequestParam String date, @RequestParam String title,
            @RequestParam String content, ModelAndView modelAndView) {
        // insert biz
        DataInfors dataInfors = new DataInfors();
        BoardBean bean = new BoardBean();
        bean.setUserName(userName);
        bean.setDate(date);
        bean.setTitle(title);
        bean.setContent(content);
        List<BoardBean> boardList = dataInfors.insertBean(bean); // 새로운 글을 DB에 저장하고나서 변화된 게시판 내용을 불러온다.

        modelAndView.addObject("boardList", boardList);
        modelAndView.setViewName("board/list");
        return modelAndView;
    }

    @RequestMapping(value = "/editSave", method = RequestMethod.POST)
    public ModelAndView editPost(@RequestParam String userName, @RequestParam String date, @RequestParam String title,
            @RequestParam String content, @RequestParam String index, ModelAndView modelAndView) {
        // insert biz
        int i = Integer.parseInt(index);
        DataInfors dataInfors = new DataInfors();
        BoardBean bean = new BoardBean();
        bean.setUserName(userName);
        bean.setDate(date);
        bean.setTitle(title);
        bean.setContent(content);
        List<BoardBean> boardList = dataInfors.getBoard();

        boardList.set(i, bean);
        modelAndView.addObject("boardList", boardList);
        modelAndView.setViewName("board/list");
        return modelAndView;
    }

    @RequestMapping(value = { "", "/", "/list" })
    public ModelAndView list(ModelAndView modelAndView) {
        DataInfors dataInfors = new DataInfors();
        List<BoardBean> boardList = dataInfors.getBoard();
        modelAndView.addObject("boardList", boardList);
        modelAndView.setViewName("board/list");
        return modelAndView;
    }

    @RequestMapping(value = "/view")
    public ModelAndView view(@RequestParam String title, @RequestParam String index, ModelAndView modelAndView) {
        DataInfors dataInfors = new DataInfors();
        BoardBean boardBean = dataInfors.getBean(title); // 선택한 게시물 정보를 가져온다.

        modelAndView.addObject("boardBean", boardBean);
        modelAndView.setViewName("board/view");
        return modelAndView;
    }

    @RequestMapping(value = "/edit", method = RequestMethod.GET)
    public ModelAndView edit(@RequestParam String title, @RequestParam String index, ModelAndView modelAndView) {
        DataInfors dataInfors = new DataInfors();
        BoardBean boardBean = dataInfors.getBean(title);

        modelAndView.addObject("boardBean", boardBean);
        modelAndView.setViewName("board/edit");
        return modelAndView;
    }
}

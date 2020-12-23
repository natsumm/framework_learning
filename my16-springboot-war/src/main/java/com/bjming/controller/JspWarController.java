package com.bjming.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class JspWarController {

    @RequestMapping("/toIndex")
    public ModelAndView toIndex() {
        ModelAndView mv = new ModelAndView();
        mv.addObject("data", "controller'method has been invoked!");
        mv.setViewName("index");
        return mv;
    }
}

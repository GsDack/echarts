package com.cn;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class gotoCotroller {
    @RequestMapping("gotomap")
    public ModelAndView gotomap() {
        ModelAndView mv = new ModelAndView("maptest");
        return mv;
    }
    @RequestMapping("gotomap1")
    public ModelAndView gotomap1() {
        ModelAndView mv = new ModelAndView("test");
        return mv;
    }
    @RequestMapping("gotomap2")
    public ModelAndView gotomap2() {
        ModelAndView mv = new ModelAndView("ss");
        return mv;
    }
}

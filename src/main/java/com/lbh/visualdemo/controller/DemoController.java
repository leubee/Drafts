package com.lbh.visualdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/charts")
public class DemoController {

    @RequestMapping("/sankey")
    public String chart_sankey(Model model) {
        return "echart-min";
    }

    @RequestMapping("/bsp")
    public String bsp() {
        return "index";
    }
}

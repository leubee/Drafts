package com.lbh.visualdemo.controller;

import com.lbh.visualdemo.service.DemoService;
import com.lbh.visualdemo.service.FrequentItemsetDTO;
import com.lbh.visualdemo.utils.FrequentItemsetDTOGenerator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/charts")
public class DemoController {

    DemoService demoService;

    public DemoController(DemoService demoService) {
        this.demoService = demoService;
    }

    @RequestMapping("/sankey")
    public String chart_sankey(Model model) {
        Map<String, List<FrequentItemsetDTO>> FIData = new HashMap<>();
        List<FrequentItemsetDTO> FIList = FrequentItemsetDTOGenerator.singleTest();
        FIData.put("FIList", FIList);
        model.addAllAttributes(FIData);
        return "echart-min";
    }

    @RequestMapping("/bsp")
    public String bsp() {
        return "index";
    }
}

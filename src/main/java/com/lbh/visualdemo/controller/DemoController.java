package com.lbh.visualdemo.controller;

import com.lbh.visualdemo.service.DemoService;
import com.lbh.visualdemo.service.FrequentModelDTO;
import com.lbh.visualdemo.utils.FrequentModelDTOGenerator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

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
        Map<String, List<FrequentModelDTO>> FIData = new HashMap<>();
        List<FrequentModelDTO> FIList = FrequentModelDTOGenerator.singleTest();
        FIData.put("FIList", FIList);
        model.addAllAttributes(FIData);
        return "echart-min";
    }

    @RequestMapping("/bsp")
    public String bsp() {
        return "index";
    }
}

package com.lbh.visualdemo.controller;

import com.lbh.visualdemo.utils.FrequentItemSetDTOGenerator;
import com.lbh.visualdemo.utils.FrequentModelDTOGenerator;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/data")
public class DataController {


    @GetMapping("/filist")
    public Map<String, Object> getAllFIList() {
        Map<String, Object> res = new HashMap<>();
        res.put("itemSetList", FrequentItemSetDTOGenerator.singleTest());
        res.put("modelList", FrequentModelDTOGenerator.singleTest());
        return res;
    }

}

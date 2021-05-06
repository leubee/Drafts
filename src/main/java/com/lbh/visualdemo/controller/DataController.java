package com.lbh.visualdemo.controller;

import com.lbh.visualdemo.service.FrequentItemsetDTO;
import com.lbh.visualdemo.utils.FrequentItemsetDTOGenerator;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/data")
public class DataController {


    @GetMapping("/filist")
    public List<FrequentItemsetDTO> getAllFIList() {
        return FrequentItemsetDTOGenerator.singleTest();
    }
}

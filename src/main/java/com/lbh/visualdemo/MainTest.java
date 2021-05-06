package com.lbh.visualdemo;

import com.lbh.visualdemo.service.FrequentItemsetDTO;
import com.lbh.visualdemo.utils.FrequentItemsetDTOGenerator;

import java.util.ArrayList;
import java.util.List;

public class MainTest {
    public static void main(String[] args) {
        List<FrequentItemsetDTO> list = FrequentItemsetDTOGenerator.singleTest();
        for (FrequentItemsetDTO fi : list) {
            System.out.println(fi.getSource() + " -----> " + fi.getTarget() + " :" + fi.getConfidence() + '\n');
        }
    }
}

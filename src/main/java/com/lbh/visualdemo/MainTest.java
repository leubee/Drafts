package com.lbh.visualdemo;

import com.lbh.visualdemo.service.FrequentModelDTO;
import com.lbh.visualdemo.utils.FrequentModelDTOGenerator;

import java.util.List;

public class MainTest {
    public static void main(String[] args) {
        List<FrequentModelDTO> list = FrequentModelDTOGenerator.singleTest();
        for (FrequentModelDTO fi : list) {
            System.out.println(fi.getSource() + " -----> " + fi.getTarget() + " :" + fi.getConfidence() + '\n');
        }
    }
}

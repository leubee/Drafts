package com.lbh.visualdemo.utils;

import com.lbh.visualdemo.service.FrequentItemsetDTO;

import java.util.ArrayList;
import java.util.List;

public class FrequentItemsetDTOGenerator {

    public static List<FrequentItemsetDTO> singleTest() {
        FrequentItemsetDTO a = new FrequentItemsetDTO();
        a.setSource("a-source");
        a.setTarget("a-target");
        a.setConfidence(0.13123434);

        FrequentItemsetDTO b = new FrequentItemsetDTO();
        b.setSource("b-source");
        b.setTarget("b-target");
        b.setConfidence(0.432733123);

        FrequentItemsetDTO c = new FrequentItemsetDTO();
        c.setSource("c-source");
        c.setTarget("c-target");
        c.setConfidence(0.13428448);

        List<FrequentItemsetDTO> res = new ArrayList<>();
        res.add(a);
        res.add(b);
        res.add(c);

        return res;
    }
}

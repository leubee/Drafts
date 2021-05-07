package com.lbh.visualdemo.utils;

import com.lbh.visualdemo.service.FrequentItemSetDTO;

import java.util.ArrayList;
import java.util.List;

public class FrequentItemSetDTOGenerator {
    public static List<FrequentItemSetDTO> singleTest() {
        List<FrequentItemSetDTO> res = new ArrayList<>();

        FrequentItemSetDTO a = new FrequentItemSetDTO();
        a.setItemSet("a-source");
        a.setSupport(0.8813103);
        res.add(a);

        FrequentItemSetDTO b = new FrequentItemSetDTO();
        b.setItemSet("a-target");
        b.setSupport(0.8213411);
        res.add(b);

        FrequentItemSetDTO c = new FrequentItemSetDTO();
        c.setItemSet("b-source");
        c.setSupport(0.9100382);
        res.add(c);

        FrequentItemSetDTO d = new FrequentItemSetDTO();
        d.setItemSet("b-target");
        d.setSupport(0.8910132);
        res.add(d);

        FrequentItemSetDTO e = new FrequentItemSetDTO();
        e.setItemSet("c-source");
        e.setSupport(0.9100382);
        res.add(e);

        FrequentItemSetDTO f = new FrequentItemSetDTO();
        f.setItemSet("c-target");
        f.setSupport(0.7913382);
        res.add(f);

        return res;

    }
}

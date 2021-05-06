package com.lbh.visualdemo.service;

import lombok.Data;

@Data
public class FrequentItemsetDTO {

    private String source;

    private String target;

    private double confidence;

}

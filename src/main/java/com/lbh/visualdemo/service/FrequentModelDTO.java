package com.lbh.visualdemo.service;

import lombok.Data;

@Data
public class FrequentModelDTO {

    private String source;

    private String target;

    private double confidence;

}

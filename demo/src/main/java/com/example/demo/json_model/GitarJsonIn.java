package com.example.demo.json_model;

import java.util.List;

public class GitarJsonIn {

    public List<GitarS> git;

    private class GitarS{
        public Integer minPrice;
        public Integer maxPrice;
        public String acoustic;
        public String electro;
        public String electroacoustics;
        public String activeSensors ;
        public String passiveSensors;
    }
}


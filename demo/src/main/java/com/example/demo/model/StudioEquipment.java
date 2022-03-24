package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class StudioEquipment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;

    private Integer price,price2;

    private Integer outLine , inLine;

    public StudioEquipment(String name,Integer price, Integer price2, Integer outLine, Integer inLine) {
        this.price = price;
        this.price2 = price2;
        this.outLine = outLine;
        this.inLine = inLine;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Integer getPrice2() {
        return price2;
    }

    public void setPrice2(Integer price2) {
        this.price2 = price2;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getOutLine() {
        return outLine;
    }

    public void setOutLine(Integer outLine) {
        this.outLine = outLine;
    }

    public Integer getInLine() {
        return inLine;
    }

    public void setInLine(Integer inLine) {
        this.inLine = inLine;
    }
}

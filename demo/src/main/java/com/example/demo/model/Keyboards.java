package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Keyboards {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Integer price;

    private String name, type;

    private Integer octaves;
    private Boolean midi;


    public Keyboards(Integer price, String name, String type, Integer octaves, Boolean midi) {
        this.price = price;
        this.name = name;
        this.type = type;
        this.octaves = octaves;
        this.midi = midi;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getOctaves() {
        return octaves;
    }

    public void setOctaves(Integer octaves) {
        this.octaves = octaves;
    }

    public Boolean getMidi() {
        return midi;
    }

    public void setMidi(Boolean midi) {
        this.midi = midi;
    }
}

package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {


    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/catalog")
    public String catalog() {
        return "catalog";
    }

    /**
     * Тут нуно указать какой HTML вернуть
     *
     * ps.
     * да я знаю что это кастылm
     * правильно делать генерацию основных элементов через js
     *
     * PS,PS.
     * ЖДИТЕ ИСПРАВЛЕНИЕ Я ВЕРНУСЬ С ПЕРВЫМ ЛУЧОМ СОЛНЦА, НА 5 ДЕНЬ, С ВОСТОКА
     * */

    @GetMapping("/product/{type}")
    public String product(@PathVariable(value = "type") String type) {
        return type;
    }





}
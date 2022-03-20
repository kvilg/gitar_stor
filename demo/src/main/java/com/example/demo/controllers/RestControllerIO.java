package com.example.demo.controllers;



import com.example.demo.controllers.repositori.GitarRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestControllerIO {

    @Autowired
    private GitarRepo postMain;




    @PostMapping("/post")
    public String trasd(@RequestBody String name) {
        return name;
    }




}

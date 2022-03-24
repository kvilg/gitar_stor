package com.example.demo.controllers;



import com.example.demo.controllers.jsonBilder.BildJson;
import com.example.demo.controllers.repositori.GitarRepo;
import com.example.demo.model.Gitar;
import org.apache.tomcat.util.json.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RestControllerIO {

    @Autowired
    private GitarRepo postMain;




    @GetMapping("/post")
    public String trasd() throws ParseException {

        List<Gitar> git = postMain.findByPriceGreaterThanAndPrice2LessThan(100000,400000);

        BildJson b= new BildJson();
        String s = b.bildJsonGit(git);

        System.out.print("nene");

       return s;

    }

    @GetMapping("/get")
    public String aa() {

        List<Gitar> gList = postMain.findByPriceGreaterThanAndPrice2LessThan(100000,400000);

        StringBuilder bild = new StringBuilder();

        for (int i = 0; i < gList.size(); i++) {
            bild.append(gList.get(i).getPrice()).append(" ;");
        }

        return bild.toString();
    }



}

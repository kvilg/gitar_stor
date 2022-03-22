package com.example.demo.controllers;



import com.example.demo.controllers.repositori.GitarRepo;
import com.example.demo.json_model.GitarJson;
import com.example.demo.model.Gitar;
import com.solidfire.gson.Gson;
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




    @PostMapping("/post")
    public StringBuilder trasd(@RequestBody String jsonString) {

        Gson json = new Gson();
        GitarJson g = json.fromJson(jsonString, GitarJson.class);

        List<Gitar> gList = postMain.findByPriceLessThanAndPriceGreaterThan(0,10000);

        StringBuilder bild = new StringBuilder();

        for (int i = 0; i < gList.size(); i++) {
            bild.append(gList.get(i).getPrice()).append(" ;");
        }

        return bild;
    }

    @GetMapping("/get")
    public String aa() {
        return "{\n" +
                "        name: \"Виктор\",\n" +
                "        surname: \"Цой\"\n" +
                "    }";
    }



}

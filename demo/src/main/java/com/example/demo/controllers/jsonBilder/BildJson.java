package com.example.demo.controllers.jsonBilder;

import com.example.demo.json_model.GitarJsonOut;
import com.example.demo.model.Gitar;

import java.util.List;

public class BildJson {

    public String bildJsonGit(List<Gitar> git){

        String json = "{\n" +
                "\"listGit\":[\n";

        StringBuilder str = new StringBuilder(json);

        for (int i = 0; i < git.size(); i++) {
            str.append("{\n");
            str.append("\"price\":").append(git.get(i).getPrice()).append(",\n");
            str.append("\"type\":\"").append(git.get(i).getType()).append("\",\n");
            str.append("\"sensors\":\"").append(git.get(i).getSensors()).append("\"\n");

            if(i == git.size()-1){
                str.append("}\n");
            }else {
                str.append("}," +
                        "\n");
            }
        }

        str.append("]\n");
        str.append("}\n");

        return str.toString();
    }


}

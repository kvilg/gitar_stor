package com.example.demo.sqlRespons;

import com.example.demo.model.Gitar;

import java.sql.*;
import java.util.LinkedList;
import java.util.List;

public class JavaToMySQL {

    public static void main(String args[]) throws SQLException {

        GitarSQL s = new GitarSQL();

        List<String> strSens = new LinkedList<>();
        strSens.add("активные");
        strSens.add("пасивные");

        List<String> strT = new LinkedList<>();
        strT.add("электро");
        strT.add("акустическа");

        List<Gitar> a = s.getGitar(40000,80000,strSens,strT);

        for (int i = 0; i < a.size(); i++) {
            System.out.println(a.get(i).getName());
            System.out.println(a.get(i).getType());
            System.out.println(a.get(i).getSensors());
            System.out.println(a.get(i).getPrice());
            System.out.println();
            System.out.println();
        }

    }
}

package com.example.demo.sqlRespons;

import com.example.demo.model.Gitar;

import java.sql.*;
import java.util.LinkedList;
import java.util.List;

public class GitarSQL {
    private static final String url = "jdbc:mysql://localhost:3306/internet_magaz";
    private static final String user = "mysql";
    private static final String password = "";

    private static Connection con;
    private static Statement stmt;
    private static ResultSet rs;


    public GitarSQL() throws SQLException {
        con = DriverManager.getConnection(url, user, password);

        // getting Statement object to execute query
        stmt = con.createStatement();

        // executing SELECT query
    }
    public List<Gitar> getGitar(Integer min, Integer max, List<String> sensor, List<String> type) throws SQLException {
        String minIn = "";
        String maxIn = "";
        String sensorIn = "";
        String typeIn = "";




        if(min != null){

            if (max != null) {
                minIn = "`price` > "+min+" and ";
            }else {
                minIn = "`price` > "+min;
            }
        }

        if(max != null){
            if (sensor != null|| type != null) {
                maxIn = "`price` < " + max + " and ";
            }else {
                maxIn = "`price` < " + max;
            }
        }

        if(sensor != null ){

            StringBuilder sensBild = new StringBuilder();
            sensBild.append("(");
            for (int i = 0; i < sensor.size(); i++) {
                sensBild.append("`sensors` = '").append(sensor.get(i)).append("'");
                if(i != sensor.size()-1 ){
                    sensBild.append(" or ");
                }
            }

            sensBild.append(")");
            if (type != null){
                sensBild.append(" and ");
            }
            sensorIn = sensBild.toString();

        }


        if(type != null){

            StringBuilder typeBild = new StringBuilder();
            typeBild.append("(");
            for (int i = 0; i < type.size(); i++) {
                typeBild.append("`type` = '").append(type.get(i)).append("'");
                if(i != type.size()-1){
                    typeBild.append(" or ");
                }
            }
            typeBild.append(")");

            typeIn = typeBild.toString();
        }


        System.out.println("SELECT * FROM `gitar` WHERE "+minIn+maxIn+sensorIn+typeIn);

        System.out.println("\n\n\n\n\n\n\n\n");

        rs = stmt.executeQuery("SELECT * FROM `gitar` WHERE "+minIn+maxIn+sensorIn+typeIn);





        List<Gitar> gitar = new LinkedList<>();

        while (rs.next()){
            String nameOut = rs.getString(2);
            Integer priceOut = rs.getInt(3);
            String sensorOut = rs.getString(4);
            String typeOut = rs.getString(5);
            gitar.add(new Gitar(nameOut,priceOut,typeOut,sensorOut));
        }
        return gitar;


    }
}

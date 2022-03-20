package com.example.demo;

import java.util.Random;

public class Main {
    public static void main(String[] args) {


        for (int i = 0; i < 100; i=i+5) {
            System.out.println("INSERT INTO `gitar`(`id`, `name`, `price`, `sensors`, `type`) VALUES ('"+i+"','gitar-telecaster"+i+"','"+i*13000+"','активные','акустическа');");
            System.out.println("INSERT INTO `gitar`(`id`, `name`, `price`, `sensors`, `type`) VALUES ('"+(i+1)+"','gitar-telecaster"+(i+1)+"','"+i*11000+"','активные','электро');");
            System.out.println("INSERT INTO `gitar`(`id`, `name`, `price`, `sensors`, `type`) VALUES ('"+(i+2)+"','gitar-telecaster"+(i+2)+"','"+i*12000+"','пасивные','электро');");
            System.out.println("INSERT INTO `gitar`(`id`, `name`, `price`, `sensors`, `type`) VALUES ('"+(i+3)+"','gitar-telecaster"+(i+3)+"','"+i*15000+"','пасивные','акустическа');");
            System.out.println("INSERT INTO `gitar`(`id`, `name`, `price`, `sensors`, `type`) VALUES ('"+(i+4)+"','gitar-telecaster"+(i+4)+"','"+i*23000+"','активные','электро-акустика');");
        }

        System.out.println("\n\n\n\n\n\n\n\n\n\n\n");


        for (int i = 0; i < 100; i++) {
            int a = i;
            System.out.println("INSERT INTO `headphones`(`id`, `name`, `price`, `type`, `wire`) VALUES ('"+i+"','наушники"+i+"','"+a*13000+"','внутриканальные',true);");
            i++;
            System.out.println("INSERT INTO `headphones`(`id`, `name`, `price`, `type`, `wire`) VALUES ('"+i+"','наушники"+i+"','"+a*11000+"','динамические закрытые',true);");
            i++;
            System.out.println("INSERT INTO `headphones`(`id`, `name`, `price`, `type`, `wire`) VALUES ('"+i+"','наушники"+i+"','"+a*9000+"','закрытые',false);");
            i++;
            System.out.println("INSERT INTO `headphones`(`id`, `name`, `price`, `type`, `wire`) VALUES ('"+i+"','наушники"+i+"','"+a*12000+"','открытые',false);");
            i++;
            System.out.println("INSERT INTO `headphones`(`id`, `name`, `price`, `type`, `wire`) VALUES ('"+i+"','наушники"+i+"','"+a*10000+"','полуоткрытые',false);");
            i++;
            System.out.println("INSERT INTO `headphones`(`id`, `name`, `price`, `type`, `wire`) VALUES ('"+i+"','наушники"+i+"','"+a*16000+"','открытые',true);");
        }

        System.out.println("\n\n\n\n\n\n\n\n\n\n\n");

        for (int i = 0; i < 100; i++) {
            int a =i;
            System.out.println("INSERT INTO `keyboards`(`id`, `midi`, `name`, `octaves`, `price`, `type`) VALUES ('"+i+"',true,'piano"+i+"','2','"+a*3000+"','сентезатор');");
            i++;
            System.out.println("INSERT INTO `keyboards`(`id`, `midi`, `name`, `octaves`, `price`, `type`) VALUES ('"+i+"',true,'piano"+i+"','3','"+a*3000+"','сентезатор');");
            i++;
            System.out.println("INSERT INTO `keyboards`(`id`, `midi`, `name`, `octaves`, `price`, `type`) VALUES ('"+i+"',true,'piano"+i+"','5','"+a*13000+"','сентезатор');");
            i++;
            System.out.println("INSERT INTO `keyboards`(`id`, `midi`, `name`, `octaves`, `price`, `type`) VALUES ('"+i+"',true,'piano"+i+"','7','"+a*33000+"','электро-пиано');");
            i++;
            System.out.println("INSERT INTO `keyboards`(`id`, `midi`, `name`, `octaves`, `price`, `type`) VALUES ('"+i+"',true,'piano"+i+"','7','"+a*23000+"','форте-пиано');");
            i++;
            System.out.println("INSERT INTO `keyboards`(`id`, `midi`, `name`, `octaves`, `price`, `type`) VALUES ('"+i+"',true,'piano"+i+"','7','"+a*53000+"','форте-пиано');");
        }

        System.out.println("\n\n\n\n\n\n\n\n\n\n\n");

        for (int i = 0; i < 100; i++) {
            int a = i;
            System.out.println("INSERT INTO `microphones`(`id`, `name`, `orientation`, `price`, `type`) VALUES ('"+i+"','micropon"+i+"','изменяемая','"+a*3000+"','динамический');");
            i++;
            System.out.println("INSERT INTO `microphones`(`id`, `name`, `orientation`, `price`, `type`) VALUES ('"+i+"','micropon"+i+"','изменяемая','"+a*1000+"','конденсаторный');");
            i++;
            System.out.println("INSERT INTO `microphones`(`id`, `name`, `orientation`, `price`, `type`) VALUES ('"+i+"','micropon"+i+"','изменяемая','"+a*5000+"','конденсаторный');");
            i++;
            System.out.println("INSERT INTO `microphones`(`id`, `name`, `orientation`, `price`, `type`) VALUES ('"+i+"','micropon"+i+"','кардиоида','"+a*12000+"','динамический');");
            i++;
            System.out.println("INSERT INTO `microphones`(`id`, `name`, `orientation`, `price`, `type`) VALUES ('"+i+"','micropon"+i+"','кардиоида','"+a*9000+"','динамический');");
            i++;
        }

        System.out.println("\n\n\n\n\n\n\n\n\n\n\n");

        for (int i = 0; i < 100; i++) {
            int a = i;
            System.out.println("INSERT INTO `percussion`(`id`, `model`, `name`, `price`, `type`) VALUES ('"+i+"','акустическая','baraban"+i+"','"+a*13000+"','null');");
            i++;
            System.out.println("INSERT INTO `percussion`(`id`, `model`, `name`, `price`, `type`) VALUES ('"+i+"','электро','baraban"+i+"','"+a*7000+"','sm104');");
            i++;
            System.out.println("INSERT INTO `percussion`(`id`, `model`, `name`, `price`, `type`) VALUES ('"+i+"','акустическая','baraban"+i+"','"+a*9000+"','null');");
            i++;
            System.out.println("INSERT INTO `percussion`(`id`, `model`, `name`, `price`, `type`) VALUES ('"+i+"','электро','baraban"+i+"','"+a*10000+"','sm110');");


        }

        System.out.println("\n\n\n\n\n\n\n\n\n\n\n");

        for (int i = 0; i < 100; i++) {
            int a = i;
            System.out.println("INSERT INTO `studio_equipment`(`id`, `in_line`, `name`, `out_line`, `price`) VALUES ('"+i+"','"+i%15+"','akustic"+i+"','"+(i+2)%15+"','"+a*8300+"');");
            i++;
            System.out.println("INSERT INTO `studio_equipment`(`id`, `in_line`, `name`,`out_line`, `price`) VALUES ('"+i+"','"+i%15+"','akustic"+i+"','"+(i+2)%15+"','"+a*9300+"');");
            i++;
            System.out.println("INSERT INTO `studio_equipment`(`id`, `in_line`, `name`,`out_line`, `price`) VALUES ('"+i+"','"+i%15+"','akustic"+i+"','"+(i+2)%15+"','"+a*11300+"');");
            i++;
            System.out.println("INSERT INTO `studio_equipment`(`id`, `in_line`, `name`,`out_line`, `price`) VALUES ('"+i+"','"+i%15+"','akustic"+i+"','"+(i+2)%15+"','"+a*14300+"');");
            i++;
            System.out.println("INSERT INTO `studio_equipment`(`id`, `in_line`, `name`,`out_line`, `price`) VALUES ('"+i+"','"+i%15+"','akustic"+i+"','"+(i+2)%15+"','"+a*2300+"');");
        }
    }
}

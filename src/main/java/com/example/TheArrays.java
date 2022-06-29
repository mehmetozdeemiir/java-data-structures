package com.example;

import java.util.Arrays;

public class TheArrays {
    public static void main(String[] args) {

         String[] colors=new String[5];
         colors[0]= "purple";
         colors[1]= "black";

         System.out.println(Arrays.toString(colors));
         System.out.println(colors[0]);
         System.out.println(colors[1]);
         System.out.println(colors[2]);
         System.out.println(colors[3]);
         System.out.println(colors[4]);
         //System.out.println(colors[5]);//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException


        //1
        for (int i=0;i< colors.length;i++){
            System.out.println(colors[i]);
        }

        //2
        for (String color : colors){
            System.out.println(color);
        }
        //3
        Arrays.stream(colors).forEach(System.out::println);


        //shortcut
        int[] numbers2 = {100,200};

    }
}

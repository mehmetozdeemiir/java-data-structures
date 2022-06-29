package com.example;

import java.util.ArrayList;
import java.util.List;

public class Lists {
    public static void main(String[] args) {

        List<String> colors = new ArrayList();
        colors.add("blue");
        colors.add("purple");
        colors.add("yellow");
        colors.add("black");

        System.out.println(colors.size());//4
        System.out.println(colors.contains("yellow"));//true
        System.out.println(colors.contains("pink"));//false
        System.out.println(colors.get(3));//black //Returns the element of the list whose parameter index is given.
        System.out.println(colors.indexOf("purple"));//1 -Returns the first index of the element given in the parameter in the list.
        System.out.println(colors.subList(1,4));//[purple, yellow, black]
        System.out.println(colors);//[blue, purple, yellow, black]

        //1
        for (String color : colors){
            System.out.println(color);
        }

        //2
        colors.forEach(System.out::println);

        //3
        for (int i=0 ; i<colors.size(); i++){
            System.out.println(colors.get(i));
        }

        //immutable list
        List<String> colorsUnmodifiable=List.of(
                "blue",
                "yellow"
        );

        // colorsUnmodifiable.add("pink"); cannot be added, this list cannot be changed.

    }
}

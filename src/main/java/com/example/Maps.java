package com.example;

import java.util.HashMap;
import java.util.Map;

public class Maps {
    public static void main(String[] args) {
        Map<Integer, Person> map= new HashMap<>();
        map.put(1, new Person("Mehmet"));
        map.put(2, new Person("İrem"));
        map.put(3, new Person("Sedef"));
        map.put(3, new Person("Sedef2")); //override

        System.out.println(map);//{1=Person[name=Mehmet], 2=Person[name=İrem], 3=Person[name=Sedef2]}
        System.out.println(map.get(1));//Person[name=Mehmet]
        System.out.println(map.containsKey(4));//false
        System.out.println(map.keySet());//[1, 2, 3]
        System.out.println(map.entrySet());//[1=Person[name=Mehmet], 2=Person[name=İrem], 3=Person[name=Sedef2]]
        System.out.println(map.values());//[Person[name=Mehmet], Person[name=İrem], Person[name=Sedef2]]
        map.remove(3); //can be deleted using key only

        //1
        map.entrySet()
                .forEach(x-> System.out.println(x.getKey()+ " "+ x.getValue()));

        //2
        map.entrySet().forEach(System.out::println);


        //3
        map.forEach((key, person)->{
            System.out.println(key+ " - " +person);
        });
    }
    record Person (String name){}
}

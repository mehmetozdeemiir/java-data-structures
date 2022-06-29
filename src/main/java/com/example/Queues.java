package com.example;

import java.util.LinkedList;
import java.util.Queue;

public class Queues {
    public static void main(String[] args) {

        Queue<Person> superMarket = new LinkedList<>();
        superMarket.add(new Person("Mehmet",24));
        superMarket.add(new Person("İrem",23));
        superMarket.add(new Person("Ahmet",54));

        System.out.println(superMarket.size());//3
        System.out.println(superMarket.peek());//Person[name=Mehmet, age=24] //First in first out
        System.out.println(superMarket.poll());//Person[name=Mehmet, age=24] //-1
        System.out.println(superMarket.size());//2
        System.out.println(superMarket.peek());//Person[name=İrem, age=23]

    }

    static record Person(String name,int age){}
}

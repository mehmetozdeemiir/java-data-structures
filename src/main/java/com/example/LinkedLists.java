package com.example;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedLists {
    public static void main(String[] args) {

        LinkedList<Person> linkedLists=new LinkedList<>();
        linkedLists.addLast(new Person("Mehmet",24));
        linkedLists.addFirst(new Person("Mehmetcan",28));

        ListIterator<Person> personListIterator = linkedLists.listIterator();// this method, we can move in the desired direction between the elements of our list collection. So we can list from start to finish, from end to end.

        while(personListIterator.hasNext()){ //hasNext: Returns the next element. Returns true if there is an element in the sequence. Otherwise, NoSuchElementException is returned.
            System.out.println(personListIterator.next());
        }
        //Person[name=Mehmetcan, age=28]
        //Person[name=Mehmet, age=24]

        while(personListIterator.hasPrevious()){ //hasPrevious: Returns the previous element. Returns true if the element exists. Otherwise, NoSuchElementException is returned.
            System.out.println(personListIterator.previous());
        }
        //Person[name=Mehmet, age=24]
        //Person[name=Mehmetcan, age=28]
    }

    static record Person(String name,int age){}
}


package com.example;

import java.util.Stack;

public class Stacks {
    public static void main(String[] args) {

        Stack<Integer> stack=new Stack<>();

        stack.push(15);
        stack.push(44);
        stack.push(8);
        stack.push(16);

        System.out.println(stack.peek());//Looks at the object at the top of this stack without removing it from the stack //Last in first out //16
        System.out.println(stack.size());//4
        System.out.println(stack.pop()); //Removes the object at the top of this stack and returns that object as the value of this function //16
        System.out.println(stack.size());//3
        System.out.println(stack.peek());//8
        System.out.println(stack.empty());//false


    }
}

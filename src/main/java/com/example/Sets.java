package com.example;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Sets {
    public static void main(String[] args) {

        Set<Ball> balls = new HashSet<>();
        balls.add(new Ball("pink"));
        balls.add(new Ball("pink")); //!!!! does not contain repeated elements.
        balls.add(new Ball("red"));
        balls.add(new Ball("black"));

        balls.forEach(System.out::println);//Retrieving items in the set is possible, but the order of access is ambiguous. Does not contain repeated elements.
        System.out.println(balls.size());//record 3 , static class //4  equals and hash code write =3
    }

    //record Ball(String color){}

    static class Ball{
        String color;

        public Ball(String color) {
            this.color = color;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Ball ball = (Ball) o;
            return Objects.equals(color, ball.color);
        }

        @Override
        public int hashCode() {
            return Objects.hash(color);
        }

        @Override
        public String toString() {
            return "Ball{" +
                    "color='" + color + '\'' +
                    '}';
        }
    }


}

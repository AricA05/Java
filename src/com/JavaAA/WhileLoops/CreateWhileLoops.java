package com.JavaAA.WhileLoops;

public class CreateWhileLoops {

    public static void main(String[] args) {
        //the "while loop" allows us to loop while a boolean expression evaluates to true

        int count = 0;

        //this condition tells program to do this at least once, while the (count <= 20) condition is being held
        do {
            System.out.println(count);
            count++;

        }

        while (count <= 20);

    }
}

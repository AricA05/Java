package com.JavaAA.IfStatements;

public class CreateIfStatements {

    public static void main(String[] args) {
        //if statements allow you to execute certain sections of code depending on result of boolean expressions

        int age = 15;

        if (age >= 18) {
            System.out.println("This is an Adult");
        }
        else if (age >= 16 && age < 18) {
            System.out.println("Almost an Adult");
        }
        else {
            System.out.println("Not an Adult");
        }
    }
}
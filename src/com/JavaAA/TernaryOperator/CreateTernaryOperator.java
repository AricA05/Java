package com.JavaAA.TernaryOperator;

public class CreateTernaryOperator {

    public static void main(String[] args) {
        //ternary operators are very similar to if/else statements
        //only use ternary operators when it is an single if/else statement (don't use when there is an "else if")
        int age = 15;
        //              question here  printed if true
        String message = age >= 18 ? "This is an Adult" ://note colon use
                //printed if false
                "This is not an adult";
        System.out.println(message);
    }
}

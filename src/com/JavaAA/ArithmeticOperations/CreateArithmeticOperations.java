package com.JavaAA.ArithmeticOperations;

public class CreateArithmeticOperations {

    public static void main(String[] args) {
        //below are primitive data type variables
        int ten = 10;
        int two = 2;
        //using these two numbers, we can preform arithmetic operations
        int addition = ten + two;
        System.out.println(addition);

        //you can also just do the addition like this without creating all the variables
        int addition1 = 1 + 2;
        System.out.println(addition1);

        //or you can just do the arithmetics using the inside the system.out.println()
        //add
        System.out.println(14+3);
        //subtract
        System.out.println(9-3);
        //multiply
        System.out.println(2*5);
        //modular (this find the remainder value when dividing, e.g., 10 % 3, will return a 1
        System.out.println(10%3);
        //you can include more then 2 numbers to compute and it also automatically follows BEDMAS rule
        System.out.println(10+3*3);
        //and you can input brackets
        System.out.println((10+3)*3);

    }
}

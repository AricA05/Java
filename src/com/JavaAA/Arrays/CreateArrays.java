package com.JavaAA.Arrays;

import java.util.Arrays;

public class CreateArrays {

    public static void main(String[] args) {
        //arrays allow us to create one variable that can hold more than one value

        /*
        without arrays we do this:
        int one = 1;
        int two = 2;
        Arrays will allow for you to put both zero and one inside an array
         */

        //array creation below:
        //the "3" specifies amount of numbers array can hold, this will print [0,0,0], as the "int" default value is 0
        int [] numbers = new int[3];
        //these statements below put numbers into the array spots
        /*
        Array [0,0,0]
        Position:0 1 2
        */
        //below: position 0, store value of 0
        numbers[0] = 0;
        //position 1, store value of 1
        numbers[1] = 1;
        //position of 2, store value of 2
        numbers[2] = 2;
        System.out.println(Arrays.toString(numbers));

        /*SIMPLE VERSION OF ARRAY CREATION:
        int [] numbers = {0,1,2};
        System.out.println(Arrays.toString(numbers));
        */

        //note: you can also create arrays for strings, booleans, etc...
    }
}

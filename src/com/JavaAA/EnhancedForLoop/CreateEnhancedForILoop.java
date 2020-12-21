package com.JavaAA.EnhancedForLoop;

public class CreateEnhancedForILoop {

    public static void main(String [] args) {

        int[] numbers = {2,0,1,4,100,4,90,78,77};

        //standard loop, this loop allows you to specifically search for an index value in the loop
        for (int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i+1]);
        }

        //enhanced loop
        //for numbers, take individual numbers 1 by 1 and but inside variable called number
        System.out.println("enhanced loop:");
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}

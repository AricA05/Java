package com.JavaAA.ComparisonOperators;

public class CreateComparisonOperators {

    public static void main(String[] args) {
        //comparison operators allow us to compare values

        int johnAge = 18;
        int jeffAge = 20;

        //we use the boolean primitive data type to get a true or false answer
        boolean isJohnOlderThanJeff = johnAge > jeffAge;

        System.out.println(isJohnOlderThanJeff);

        //you can also do this by putting the equation into the system.out line e.g. below:
        System.out.println(johnAge > jeffAge);
        System.out.println(johnAge < jeffAge);
        //below is for "equal to"
        System.out.println(johnAge == jeffAge);
        //below is for "NOT equal to"
        System.out.println(johnAge != jeffAge);
    }

}

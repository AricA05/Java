package com.JavaAA.Methods;

public class CreateMethods {

    public static void main(String[] args) {
        //methods are block of code that only runs when called. Methods are used to preform any logic, whether it is passing data, actions, or any piece of code that does something
        //there are to types of methods; 1. built-in, 2.User created methods

        //"print.lin" is a built-in method, the brackets are used to invoke the method
        System.out.println("Hello");

        String brand = "Samsung";
        //".toUpperCase" is another example of a built-in method, it transforms the passed data to upper-case
        System.out.println(brand.toUpperCase());

        //".startsWith" is another built-in method that returns a boolean (true or false)
        System.out.println(brand.startsWith("S"));

    }
}

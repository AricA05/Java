package com.JavaAA;
//namespace

//note: a class is like a "blueprint" for creating objects (object instructor)

//class
public class FirstTime {
    //"public" keyword is an access modifier which represents visibility, it can be seen anywhere in the application
    //class level = public, can be seen anywhere within application - this is the visibility key access modifier
    //"class" keyword is used to declare a class in Java
    //"FirstTime" is simply the name of the class

    public static void main(String[] args) {
    //"static" keyword is at the class level, static allows use to NOT have to create an object for the "FirstTime" class
    //void is the return type of the method, it means it doesn't return any value
    //main represents the startup of the program
    //String[] args is used for command line argument
        System.out.println("Hello World");
        //system can be imagined as a class
        //System.out.println is used print statement


    }
}

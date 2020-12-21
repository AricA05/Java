package com.JavaAA.ClassAndObjects;

public class CreateClassesAndObjects {

    public static void main(String[] args) {
        //object creation
        //"lensOne" is what we are modelling/creating
        Lens lensOne = new Lens("Sony", "85mm",true);
        //you can create as many object as you want
        Lens lensTwo = new Lens("Sony", "30mm",true);

        Lens lensThree = new Lens("Canon", "24-70mm",false);

        //printing object attributes for lensOne
        System.out.println("Lens 1:");
        System.out.println(lensOne.brand);
        System.out.println(lensOne.focalLength);
        System.out.println(lensOne.isPrime);

        //printing object attributes for lensTwo
        System.out.println("Lens 2:");
        System.out.println(lensTwo.brand);
        System.out.println(lensTwo.focalLength);
        System.out.println(lensTwo.isPrime);

        //printing object attributes for lensThree
        System.out.println("Lens 3:");
        System.out.println(lensThree.brand);
        System.out.println(lensThree.focalLength);
        System.out.println(lensThree.isPrime);

    }

    //the class created below is for a Camera Lens example
    //the "static" keyword is used here so we can use the class created inside the "public static void main"
    static class Lens {
        //below are the attributes/properties of a camera lens
        String brand;
        String focalLength;
        boolean isPrime;


        //the below line is called a "constructor" is is used to construct objects
        Lens(String brand, String focalLength, boolean isPrime) {
            //"this" refers to current instance of current class
            this.brand = brand;
            this.focalLength = focalLength;
            this.isPrime = isPrime;
        }

    }

}

/*
notes:
A class is a blueprint to create anything that you want
Classes basically are templates or instruction that explain how to create something
The thing that the class creates is called an object
Classes have to main features: 1. Attributes (what the object created looks like), 2. Behaviours (what the object created can do)
 */
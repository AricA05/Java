package com.JavaAA.PrimDTVsReferenceDT;

public class PrimVsReference {

    public static void main (String[] args) {
        //primitive data types
        //int a holds value of 10
        int a = 10;
        //int b takes value of a (10) and holds it in its memory, it is untouched at this point
        int b = a;
        //a is redefined here and the b remains untouched
        a = 100;
        System.out.println("a " + a + " -b " + b);

        //Person alex is a reference to the object  person() is the object
        Person alex = new Person("Alex");
        //below: person john will point to the Person() object
        Person john = alex;

        System.out.println("before changing alex");
        System.out.println(alex.name + " " + john.name);

        //this changes the name of the "john" reference
        alex.name = "alexander";

        System.out.println("after changing alex");
        System.out.println(alex.name + " " + john.name);
    }
        //reference data types
    static class Person {
        String name;
        Person(String name) {
            this.name = name;
        }

    }



}

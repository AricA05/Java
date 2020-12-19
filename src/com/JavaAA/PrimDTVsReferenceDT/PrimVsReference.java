package com.JavaAA.PrimDTVsReferenceDT;

public class PrimVsReference {

    public static void main (String[] args) {
        //primitive data types
        //int a holds value of 10
        int a = 10;
        //int b takes value of a (10) and holds it in its memory, it is untouched at this point
        int b = a;
        //a is redefined here
        a = 100;
        System.out.println("a " + a + " -b " + b);

        //person alex is the first object
        Person alex = new Person("Alex");
        //"alex" below is a reference to above class
        Person john = alex;
    }
        //reference data types
    static class Person {
        String name;
        Person(String name) {
            this.name = name;
        }

    }



}

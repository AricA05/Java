package com.JavaAA.ReferenceDatatypes;

import java.time.LocalDate;

public class CreateReferenceDT {

    public static void main(String[] args) {
        //Non primitive data types AKA reference types
        //reference types always start with an uppercase letter
        String name = new String("TestCode");
        //"String" is a reference type that allows you to store a sequence of characters
        //reference types also give you build in behaviours, e.g., "toUpperCase changes entire string into upper case letters
        System.out.println(name.toUpperCase());

        //Local date is another example of a reference data type, it allows you to get the current date in different forms!
        LocalDate now = LocalDate.now();
        System.out.println(now.getMonth());

    }
}

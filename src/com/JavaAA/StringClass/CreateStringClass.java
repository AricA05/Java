package com.JavaAA.StringClass;

public class CreateStringClass {

    public static void main (String[] args) {
        //String allows you to input more than one character
        //"string" is the class/reference type, "name" is the object all objects have behaviours associated with it (e.g., toUpperCase)
        String name = new String("now you can input more than one character");
        //"name" is the object, "toUpperCase" is the behaviour/method - it will upper case the string
        System.out.println(name.toUpperCase());
        //lower case method
        System.out.println(name.toLowerCase());
        //this method will get the first character (index 0)
        System.out.println(name.charAt(0));
        //the below method check if a certain word is in the string. It will return "true" if it is and "false" if it is not
        System.out.println(name.contains("one"));





    }

}
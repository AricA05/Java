package com.JavaAA.LogicalOperators;

public class CreateLogicalOperators {

    public static void main(String[] args) {
        //logical operators allow us to combine multiple boolean expressions

        boolean isAdult = false;
        boolean isStudent = true;
        boolean isAnimal = false;
        //"&&" (and) is used to check if all the expressions are "true", if not the final output will return "false"
        System.out.println(isAdult && isStudent);

        //this check is any of the boolean expressions are "true", if one of them is true then then it will return true
        System.out.println(isAdult || isStudent);

        //this checks if either of isAdult and isStudent are true, and if isAnimal is true. If one of the isAdult/isStudent is true, then it will return true unless isAnimal is false.
        System.out.println((isAdult || isStudent) && isAnimal);

        /*
        note: for logical operators, you can apply all of the comparison operator features to determine true and false
         */
    }
}

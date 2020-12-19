package com.JavaAA.SwitchStatements;

public class CreateSwitchStatements {

    public static void main(String[] args) {
        //switch statement falls under same category as if/else statement
        //switch statement allows us to make else/if statements a bit neater.
        //only use switch statements when evaluating one string/value

        String gender = "Male";

        switch (gender) {
            case "Female":
                System.out.println("This is a female");
                break;
            case "Male":
                System.out.println("This is a male");
                break;
            case "Rather not say":
                System.out.println("Prefer to not say");
                break;
            default:
                System.out.println("Unknown");
        }

    }
}

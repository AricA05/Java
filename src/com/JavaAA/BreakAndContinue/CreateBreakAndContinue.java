package com.JavaAA.BreakAndContinue;

public class CreateBreakAndContinue {

    public static void main(String[] args) {

        //string array of names
        String[] names = {"Anna", "Bob", "Alex", "Andrew"};
        String[] names2 = {"Tennis", "Hockey", "Basketball", "Golf"};

        //loop: this loop can search for specific name within the "names" array
        for (String name : names) {
            System.out.println(name);
            //the break line here tells the system to print the first name in the array then break/end
            break;
        }

        System.out.println("Break Example #2:");
        //in this break loop, the program prints all of the names except for anything "basketball" and beyond
        for (String name : names2) {
            if (name.equals("Basketball")) {
                break;
            }
            System.out.println(name);
        }


        System.out.println("Continue example:");
        //in this continue loop, the program will search for the names that start with the letter "B", and will only print those that don't
        for (String name : names) {
            if (name.startsWith("B")) {
                continue;
            }
            System.out.println(name);
        }

    }


}


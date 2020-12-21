package com.JavaAA.ScannerClass;

import java.time.LocalDate;
import java.util.Scanner;

public class CreateScannerClass {

    public static void main(String[] args) {
        //the scanner class allows you to take user input from the console
     //notice import ----- second "scanner" one in grey is an object that can take user input from the console
        //system.in means to take input from user or keyboard
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");
        //the userName variable is used to hold whatever the user inputs, the nextLine() means to take the input that comes from the console
        String userName = scanner.nextLine();
        System.out.println("Hello " + userName);


        //below finds year user was born in
        System.out.println("How old are you?");
        int age = scanner.nextInt();
        //subtract current year minus age
        int year = LocalDate.now().minusYears(age).getYear();
        System.out.println("You were born in " + year);

        //check whether adult or not
        if (age < 18) {
            System.out.println("and you are not an adult");
        }
        else {
            System.out.println("and you are an adult");
        }

    }
}

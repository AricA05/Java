package com.JavaAA.PassportExample;

import java.time.LocalDate;

public class CreatePassportExample {

    public static void main(String[] args) {

        Passport ukPassport = new Passport("1234", LocalDate.of(2025,1,1),"UK");

        Passport usPassport = new Passport("123999", LocalDate.of(2030,1,1), "USA");

        System.out.println("UK PASSPORT");
        System.out.println(ukPassport.number);
        System.out.println(ukPassport.expiryDate);
        System.out.println(ukPassport.country);

        System.out.println("US PASSPORT:");
        System.out.println(usPassport.number);
        System.out.println(usPassport.expiryDate);
        System.out.println(usPassport.country);
    }

    static class Passport {
        String number;
        LocalDate expiryDate;
        String country;

        Passport(String number, LocalDate expiryDate, String country) {
            this.number = number;
            this.expiryDate = expiryDate;
            this.country = country;
        }
    }
}

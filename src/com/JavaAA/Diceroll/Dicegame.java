package com.JavaAA.Diceroll;

import java.util.Random;

public class Dicegame {

    public static void main(String[] Args) {

        Random randNumb = new Random();
        int x = randNumb.nextInt(6) + 1;

        System.out.println("You rolled a: " + x);

    }

}

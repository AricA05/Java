package com.JavaAA.UnderstandingMethods;

public class CreateNewMethod {

    public static void main(String[] args) {

        //character array
        char[] letters = {'A', 'A', 'B', 'C', 'D', 'D', 'D'};
        //BELOW: invoking method
        int count = countOccurrences(letters, 'D');
        System.out.println(count);
    }

    //public means this method is accessible by other classes
    //static means the method belongs to a class
    //int is the return type of the method (integer)
    //countOccurrences is the name of the method that is being created
    //the method that is being created below will count the number of occurrences of any given letter
    public static int countOccurrences(char [] letters, char searchLetter) {

        int count = 0;
        for (char letter : letters) {
            if (letter == searchLetter) {
                count++;
            }
        }
        //the below line gets processed on like 11
        return count;

    }
}

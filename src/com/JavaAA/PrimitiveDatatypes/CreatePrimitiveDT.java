package com.JavaAA.PrimitiveDatatypes;

public class CreatePrimitiveDT {

    public static void main(String[] args) {
        byte theByte = -128;
        short theShort = -32768;
        int theInt = 787838334;
        long theLong = 787838334L;
        //all 4 of the above data types allow you to store whole numbers - the only difference is the size of number
        //the larger the number, the more bytes it takes up
        //some of the data types require a letter at the end to signify which data type it is, as some are very similar (e.g., float and double)
        float theFloat = 3.14F;
        double theDouble = 3.1415;

        boolean theBoolean = true;//can be true or false

        char theChar = 'A';//make sure single quotes are used

        //the system.out.println below should all print whatever value is in each datatype
        System.out.println(theByte);
        System.out.println(theShort);
        System.out.println(theInt);
        System.out.println(theLong);
        System.out.println(theFloat);
        System.out.println(theDouble);
        System.out.println(theBoolean);
        System.out.println(theChar);

    }
}

/*
note: all the different data-types (e.g., byte, short, int, etc..) are reserved keywords, so they cannot be referred to once used

Datatype        Size        Description
byte            1 byte      stores whole numbers from -128 to +127
short           2 bytes     stores whole numbers from -32,768 to 32,767
int             4 bytes     stores whole numbers from -2,147,483,648 to 2,147,483,647
long            8 bytes     stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
float           4 bytes     stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
double          8 bytes     stores fractional numbers. Sufficient for storing 15 decimal digits
boolean         1 bit       stores true or false values
char            2 bytes     stores a single character/letter or ASCII values

 */
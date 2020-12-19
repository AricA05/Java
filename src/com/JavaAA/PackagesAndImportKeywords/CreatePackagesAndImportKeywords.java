package com.JavaAA.PackagesAndImportKeywords;
//the above "package" keyword tells us that we are inside of com.JavaAA.PackagesAndImportKeywords

import java.time.LocalDate;
//package for line 14
import java.time.LocalDateTime;
//package for line 16
import java.util.Date;
//this appears when Date java.util is selected. Essentially, this says "from java.util, import "Date" class so it can be used"

public class CreatePackagesAndImportKeywords {

    public static void main(String[] args) {
        Date date = new Date();
        String s = new String();
        //no import statement for the "String" because it comes from the standard "java.lang" package
        LocalDate localDate = LocalDate.now();
        LocalDateTime localDateTime = LocalDateTime.now();



    }



}

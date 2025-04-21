// Java program to demonstrate that var data type can be used with all data types
package com.vardatatype;

// Main class
public class Main {

    // Method main to run java program
    public static void main(String[] args) {

        // byte
        byte number = 126;

        // int
        var number0 = 100;

        // double
        var number1 = 100.2;

        // char
        var character = 'a';

        // string
        var string = "ABC";

        // boolean
        var boolean1 = true;

        // long
        var number2 = 100L;

        // float
        var number3 = 100.3f;

        // Printing values of all variables, automatically detecting their types
        System.out.println(number);
        System.out.println(number0);
        System.out.println(number1);
        System.out.println(character);
        System.out.println(string);
        System.out.println(boolean1);
        System.out.println(number2);
        System.out.println(number3);
    }
}
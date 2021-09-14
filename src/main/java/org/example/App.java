/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Nikolai Coletta
 */
package org.example;
import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);

        System.out.println( "Press C to convert from Fahrenheit to Celsius." );
        System.out.println( "Press F to convert from Celsius to Fahrenheit." );
        System.out.print( "Your choice: " );
        String temp = scan.nextLine();

        int degrees;

        if( temp.toUpperCase().equals("C") ) {
            System.out.println( "Please enter the temperature in Fahrenheit: " );
            degrees = Integer.parseInt( scan.nextLine() );
            System.out.println( "The temperature in Celsius is " + ((degrees - 32) * 5 / 9) );
        }
        else if ( temp.toUpperCase().equals("F") ) {
            System.out.println( "Please enter the temperature in Celsius: " );
            degrees = Integer.parseInt( scan.nextLine() );
            System.out.println( "The temperature in Fahrenheit is " + ((degrees * 9 / 5 ) + 32) );
        }


    }
}

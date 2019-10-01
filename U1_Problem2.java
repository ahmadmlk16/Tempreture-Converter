package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    /* Write a program that allows the user to convert a temperature given in degrees from either Celsius to Fahrenheit or Fahrenheit to Celsius.
           Use the following :
           Degrees_C = 5(Degrees_F− 32)/9
           Degrees_F = (9(Degrees_C)/5) + 32)
           Prompt the user to enter a temperature and either a C or c for Celsius or an F or f for Fahrenheit.
           Convert the temperature to Fahrenheit if  Celsius is entered, or to Celsius if Fahrenheit is entered.
           Display the result in a readable format.
           If anything other than C, c, F, or f is entered, print an error message and stop.

           Algorithm:
           1. This program converts fahrenheit temperature to celsius, or to celsius if fahrenheit.
           2. Ask user to enter temperature along with its unit.
           3. Save the entered into a string.
           4. Extract numbers from the saved string and save as another string.
           5. Convert the extracted numbers into double and save.
           6. If String entered contains f or F
                  calculate celsius value and display.
              Else if string contains C or c
                  calculate fahrenheit value and display.
              Else display error message.

           */

        Scanner scanner = new Scanner(System.in);
        System.out.println("This program converts fahrenheit temperature to celsius, or to celsius if fahrenheit.");
        System.out.println("Enter the temperature followed by its unit.");

        String temp = scanner.nextLine();                                     //initiates scanner

        String numbers=temp.replaceAll("[^0-9]", "");        // extracts numbers from temp string entered
        double value = Double.parseDouble(numbers);                           //converts numbers to double type

        if(temp.matches(".*[Ff].*"))                                    //executes if String temp contains f or F
        {
            value = (5*(value - 32)/9);
            System.out.println("The temperature in Celsius is : "+value+" C");
        }
        else if (temp.matches(".*[Cc].*"))                                //executes if String temp contains c or C
        {
            value = ((9*(value)/5) + 32);
            System.out.println("The temperature in Fahrenheit is : "+value+" F");
        }
        else System.out.println("Error: Invalid unit entered");                   // executes if anything else is entered
    }
}

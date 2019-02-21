// Justin Swavely 02/19/2019, this program will ask for an integer, double, and string value and makes sure the value is valid
package com.swavely.Week1;

import java.util.Scanner;

class UserInput {


    public static Integer promptInt(String message) {
        Scanner input = new Scanner(System.in);
        System.out.println(message);
        String userInput = input.nextLine();

        int userInt = 0;
        boolean isInt = false;
        while (!isInt) {
            try {
                userInt = Integer.parseInt(userInput);
                isInt = true;
            }
            catch (NumberFormatException e) {
                System.out.println(userInput + " is not a valid integer. " + message);
                userInput = input.nextLine();
            }
        }

        return userInt;
    }
    public static Double promptDouble(String message) {
        Scanner input = new Scanner(System.in);
        System.out.println(message);
        String userInput = input.nextLine();

        double userDouble = 0;
        boolean isDouble = false;
        while (!isDouble) {
            try {
                userDouble = Double.parseDouble(userInput);
                isDouble = true;
            }
            catch (NumberFormatException e) {
                System.out.println(userInput + " is not a valid double. " + message);
                userInput = input.nextLine();
            }
        }

        return userDouble;
    }
    public static String promptString(String message) {
        Scanner input = new Scanner(System.in);
        boolean isString = false;
        String userInput = ("");
        while (isString== false) {
            System.out.println(message);
            userInput = input.nextLine();
            try {
                Double.parseDouble(userInput);
                System.out.println("Your String isn't valid");
            }
            catch (NumberFormatException e) {
                isString = true;
            }
        }

        return userInput;
    }
}


public class Main {
    public static void main(String[] args) {
        UserInput.promptInt("Enter a valid integer");
        UserInput.promptDouble("Enter a valid double");
        UserInput.promptString("Enter a valid string");


    }
}

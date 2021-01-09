package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
        String userName = "";
        String response = "";
        boolean keepGoing = false;

// Establish our program's legitimacy by printing to console
        System.out.println("Hello world!");

        // Display the valid input characters
        AsciiChars.printNumbers();
        AsciiChars.printLowerCase();
        AsciiChars.printUpperCase();

        // Ask for the user's name and display it
        System.out.println("What is your name?");
        System.out.print("Name: ");
        userName = kb.nextLine();
        System.out.println("Hello, " + userName);

        // Ask if user wants to begin the interactive portion
        System.out.println("Would you like to continue to the interactive zone?");
        System.out.print("(Y/N): ");
        response = kb.nextLine();

        keepGoing=(response.equalsIgnoreCase("y"));
        System.out.println("Will we keep going: " + keepGoing);

        // Ask if user random questions
        System.out.println("Do you have a red car");
        System.out.print("(Y/N): ");
        response = kb.nextLine();

        System.out.println("What is your pets name?");
        System.out.print("petName:");
        Object petName = kb.nextLine();
        System.out.println("Awe, " + petName);

        System.out.println("How old is " + petName);
        System.out.print("petAge");
        Object petAge = kb.nextLine();
        System.out.println("Wow" + petAge);

        System.out.println("What is your lucky number?");
        System.out.print("luckyNumber:");
        Object luckyNumber = kb.nextLine();
        System.out.println("OK");

        System.out.println("What is the two-digit model year of your car?");
        System.out.print("modelNumber:");
        Object modelNumber = kb.nextLine();
        System.out.println("OK");

        System.out.println("Enter a random two-digit number");
        System.out.print("twodigitNumber:");
        Object twodigitNumber = kb.nextLine();
        System.out.println("OK");

        System.out.println("Do you have a favorite quarterback?");
        System.out.print("(Y/N): ");
        response = kb.nextLine();

        keepGoing=(response.equalsIgnoreCase("y"));
        System.out.println("What is his jersey number?" + keepGoing);
        System.out.print("jerseyNumber:");
        Object jerseyNumber = kb.nextLine();

        System.out.print("Here are your lotto numbers:" + twodigitNumber + modelNumber + luckyNumber + petAge + jerseyNumber);



    }
}
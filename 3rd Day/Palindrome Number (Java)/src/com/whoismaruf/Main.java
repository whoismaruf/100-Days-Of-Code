package com.whoismaruf;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Take input from user
        int userInputNumber, reversedNumber = 0, temporaryVariable, reminder;
        Scanner input = new Scanner(System.in);
        System.out.print("Number: ");
        userInputNumber = input.nextInt();

        // Make it reversed

        temporaryVariable = userInputNumber;
        while (temporaryVariable!=0){
            reminder = temporaryVariable%10;
            reversedNumber = reversedNumber*10 + reminder;
            temporaryVariable = temporaryVariable / 10;
        }

        // Now check if the reversed one is similar with the input

        if (userInputNumber == reversedNumber) {
            System.out.println("Its Palindrome");
        } else {
            System.out.println("Its not");
        }

    }
}

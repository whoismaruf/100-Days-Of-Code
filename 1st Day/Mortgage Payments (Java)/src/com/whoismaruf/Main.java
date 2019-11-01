package com.whoismaruf;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Welcome to Mortgage calculator. \n Please fill up the following queries to get the result");

        // Input Part

        System.out.print("Principle (At least 10k): ");
        int principle = userInput.nextInt();
        while (principle<10000) {
            System.out.print("Principle (At least 10k): ");
            principle = userInput.nextInt();
        }


        System.out.print("Annual Interest Rate: ");
        float annualInterestRate = userInput.nextFloat();
        float monthlyInterestRate = annualInterestRate/100/12;

        System.out.print("Period (Years): ");
        int period = userInput.nextInt();
        int numberOfPayments = period*12;

        //Calculation or Equation Part
        // The equation, Mortgage result = P * { r(1+r)^n / (1+r)^n-1 }

        float complexEquation = (float) Math.pow(1+monthlyInterestRate, numberOfPayments); // (1+r)^n
        float numerator = monthlyInterestRate * complexEquation;
        float denominator = complexEquation - 1;
        float fraction = numerator/denominator;
        float res = (principle * fraction);

        //Output Part

        String finalResult =  NumberFormat.getCurrencyInstance().format(res);
        System.out.println("Mortgage: " + finalResult);

        //Happy coding <3
    }
}

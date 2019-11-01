package com.whoismaruf;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// User Input
        Scanner userInput = new Scanner(System.in);
        System.out.print("Number: ");
        int input = userInput.nextByte();

        if (input%5 == 0  && input%3 == 0){
            System.out.println("FizzBuzZ");
        } else if (input%3 ==0 ) {
            System.out.println("BuzZ");
        } else if (input%5 == 0){
            System.out.println("Fizz");
        } else {
            System.out.println(input);
        }
    }
}

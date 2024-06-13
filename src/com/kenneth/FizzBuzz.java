package com.kenneth;

import java.util.Scanner;

/**
 * @author Kenneth Hudson
 * date 06/13/2024
 * A program that prints "Fizz" if a number is divisible by 3, "Buzz" if divisible by 5 and "FizzBuzz" if divisible by 15
**/

public class FizzBuzz {
	
	/**
	 * Main Method
	 * @param args Command line arguments
	 */
	public static void main(String[] args) {
		
		// Input
		Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the ending number of the list");
        System.out.print("> ");
        int listEnd = input.nextInt();
        
        // Processing + Output
        fizzBuzz(1, listEnd);
	}
	
	/**
	 * Prints "Fizz" if a number is divisible by 3, "Buzz" if divisible by 5 and "FizzBuzz" if divisible by 15
	 * @param listStart Lowest number that the loop of numbers starts with
	 * @param listEnd Highest number that makes the loop stop
	 */
	private static void fizzBuzz(int listStart, int listEnd) {
		for (int i = listStart; i <= listEnd; i++) {
			if (i % 15 == 0) {
				System.out.println("FizzBuzz");
			} else if (i % 5 == 0) {
				System.out.println("Buzz");
			} else if (i % 3 == 0) {
				System.out.println("Fizz");
			} else {
				System.out.println(i);
			}
		}
		
	}
}

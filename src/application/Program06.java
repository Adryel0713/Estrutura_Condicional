package application;

import java.util.Locale;
import java.util.Scanner;

public class Program06 {

	/*
		You must write a program that reads any value and presents a message saying which of the
		following intervals ([0,25], (25,50], (50,75], (75,100]) this value is found. Obviously if the value is not in
		none of these ranges, the message “Out of range” should be printed
	 */
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner s = new Scanner(System.in);
		
		double value = s.nextDouble();
		
		if(value < 0 || value > 100)
			System.out.println("Out of range");
		else if(value <= 25)
			System.out.println("intervals [0,25]");
		else if(value <= 50)
			System.out.println("intervals (25,50]");
		else if(value <= 75)
			System.out.println("intervals (50,75]");
		else 
			System.out.println("intervals (75,100]");
		s.close();
	}

}

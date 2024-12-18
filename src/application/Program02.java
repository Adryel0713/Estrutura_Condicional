package application;

import java.util.Locale;
import java.util.Scanner;

public class Program02 {

	/*
		Make a program to read an integer and tell if this number is even or odd.
	 */
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner s = new Scanner(System.in);
		
		int numb = s.nextInt();
		
		if(numb % 2 == 0)
			System.out.println("Even number");
		else
			System.out.println("Odd number");
		
		s.close();
	}

}

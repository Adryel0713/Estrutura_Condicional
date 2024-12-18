package application;

import java.util.Locale;
import java.util.Scanner;

public class Program01 {

	/*
		Create a program to read an integer and then say whether this number is negative or not.
	 */
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner s = new Scanner(System.in);
		
		int numb = s.nextInt();
		
		if(numb < 0)
			System.out.println("Negative");
		else
			System.out.println("Not negative");
		
		s.close();
	}

}

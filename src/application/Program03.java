package application;

import java.util.Locale;
import java.util.Scanner;

public class Program03 {

	/*
		Read 2 integer values ​​(A and B). Afterwards, the program should show a message "They are Multiple" or "They are not Multiples",
		indicating whether the values ​​read are multiples of each other. Attention: the numbers must be able to be entered in
		ascending or descending order.
	 */
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner s = new Scanner(System.in);
		
		int numb1 = s.nextInt();
		int numb2 = s.nextInt();
		
		if(numb2 % numb1 == 0 || numb1 % numb2 == 0)
			System.out.println("Are multiple!");
		else
			System.out.println("Are not multiple!");
		
		s.close();
	}

}

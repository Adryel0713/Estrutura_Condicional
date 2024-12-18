package application;

import java.util.Locale;
import java.util.Scanner;

public class Program05 {

	/*
		Based on the table below, write a program that reads the code of an item and the quantity of that item.
		the next, calculate and show the amount of the bill to be paid.
	 */
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner s = new Scanner(System.in);
		
		int code = s.nextInt();
		int quantity = s.nextInt();
		
		double tot;
		
		switch(code) {
		case 1:
			tot = quantity * 4.00;
			System.out.printf("Totally: R$%.2f",tot);
			break;
		case 2:
			tot = quantity * 4.50;
			System.out.printf("Totally: R$%.2f",tot);
			break;
		case 3:
			tot = quantity * 5.00;
			System.out.printf("Totally: R$%.2f",tot);
			break;
		case 4:
			tot = quantity * 2.00;
			System.out.printf("Totally: R$%.2f",tot);
			break;
		case 5:
			tot = quantity * 1.50;
			System.out.printf("Totally: R$%.2f",tot);
			break;
		default:
		}
		
		s.close();
	}

}

package application;

import java.util.Locale;
import java.util.Scanner;

public class Program04 {

	/*
		Read the start time and end time of a game. Next, calculate the duration of the game, knowing that it can
		start on one day and end on another, lasting a minimum of 1 hour and a maximum of 24 hours.
	 */
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner s = new Scanner(System.in);
		
		int hours1 = s.nextInt();
		int hours2 = s.nextInt();
		
		int calc;
		if(hours1 < hours2) {
			calc = hours2 - hours1;
			System.out.println("The game lasted "+calc+" hours");
		}else {
			calc = 24 - hours1 + hours2;
			System.out.println("The game lasted "+calc+" hours");
		}
		
		s.close();
	}

}

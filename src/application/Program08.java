package application;

import java.util.Locale;
import java.util.Scanner;

public class Program08 {

	/*
		In an imaginary country called Lisarb, all inhabitants are happy to pay their taxes because they know there are no corrupt politicians,
		and the collected resources are used for the benefit of the population without any mismanagement. 
		The currency of this country is Rombus, represented by the symbol R$.
		
		Read a value with two decimal places, which represents the salary of a person from Lisarb. 
		Then, calculate and show the amount this person must pay as Income Tax, according to the table below. 
		Keep in mind that if the salary is R$ 3002.00, the tax rate is 8% only on R$ 1000.00, 
		because the salary range from R$ 0.00 to R$ 2000.00 is exempt from Income Tax. In the provided example (below), 
		the tax rate is 8% on R$ 1000.00 + 18% on R$ 2.00, resulting in R$ 80.36 in total. 
		The value must be printed with two decimal places.
	 */
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner s = new Scanner(System.in);
		
		double salary = s.nextDouble();
		
		double tax;
		
		if(salary <= 2000.0)
			tax = 0.0;
		else if(salary <= 3000.0)
			tax = (salary - 2000) * 0.08;
		else if(salary <= 4500.0)
			tax = (salary - 3000) * 0.18 + 1000.0 * 0.08;
		else
			tax = (salary - 4500.0) * 0.28 + 1500 * 0.18 + 1000 * 0.08;
		
		if(tax == 0)
			System.out.println("Free");
		else
			System.out.printf("R$%.2f",tax);
		s.close();
	}

}

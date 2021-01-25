package gauravsirprograms;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		double result = 0;
		Scanner ob = new Scanner(System.in);
		System.out.println("Enter the first number");
		int no1 = ob.nextInt();
		System.out.println("Enter the Second number");
		int no2 = ob.nextInt();
		System.out.println("Enter 1 . . . . . . . . . . . . . . .    for Addition");
		System.out.println("Enter 2 . . . . . . . . . . . . . . .    for Substraction");
		System.out.println("Enter 3 . . . . . . . . . . . . . . .    for Multiplication");
		System.out.println("Enter 4 . . . . . . . . . . . . . . .    for Division");
		System.out.println("Enter 5 . . . . . . . . . . . . . . .    for Modulus");
		System.out.println("Enter 6 . . . . . . . . . . . . . . .    for Percentage");
		int choice = ob.nextInt();
		ob.close();
		switch(choice) {
		case 1 : 
			result = no1 + no2;
			System.out.println("The result of addition of "+no1+" and "+ no2+" is "+result);
			break;
		case 2 : 
			result = no1 - no2;
			System.out.println("The result of substraction of "+no1+" and "+ no2+" is "+result);
			break;
		case 3 : 
			result = no1 * no2;
			System.out.println("The result of multiplication of "+no1+" and "+ no2+" is "+result);
			break;
		case 4 : 
			result = no1 / no2;
			System.out.println("The result of division of "+no1+" and "+ no2+" is "+result);
			break;
		case 5 : 
			result = no1 % no2;
			System.out.println("The result of modulus of "+no1+" and "+ no2+" is "+result);
			break;
		case 6 : 
			result = (no1 / no2)*100;
			System.out.println("The result of percentage of "+no1+" and "+ no2+" is "+result);
			break;
		}

	}

}

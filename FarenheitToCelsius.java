package gauravsirprograms;

import java.util.Scanner;

public class FarenheitToCelsius {

	public static void main(String[] args) {
		System.out.println("Enter the temperature in Farenheit to convert it to Celsius");
		Scanner sc = new Scanner(System.in);
		int f = sc.nextInt();
		int c = 0;
		c = (f - 32) * 5/9;
		sc.close();
		System.out.println("Temperature in celcius is "+ c);
	}

}

package gauravsirprograms;

import java.util.Scanner;

public class AreaOfSolidSphere {

	public static void main(String[] args) {
		System.out.println("Enter the radius of the sphere");
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		sc.close();
		double area = 4*3.14*Math.pow(r, 2);
		System.out.println("Area of Sphere is "+ area);

	}

}

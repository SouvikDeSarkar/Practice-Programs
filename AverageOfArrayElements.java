package gauravsirprograms;

import java.util.Scanner;

public class AverageOfArrayElements {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n = sc.nextInt();
		int avg = 0; int sum = 0;
		int arr[] = new int[n];
		System.out.println("Enter the array elements");
		for(int i = 0; i<n; i++) {
			arr[i] = sc.nextInt();
			sum += arr[i];
		}
		sc.close();
		avg = sum/n;
		System.out.println("The average of the array elements are "+ avg);

	}

}

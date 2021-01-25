package gauravsirprograms;

import java.util.Scanner;

public class Checking5and10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the array elements");
		for(int i = 0; i<n; i++) 
			arr[i] = sc.nextInt();
		sc.close();
		int j = 0;
		while(j<n) {
			if(arr[j] == 5 || arr[j] == 10) {
				System.out.println("False");
				break;
			}
			else {
				System.out.println("True");
				break;
			}
		}
	}
}

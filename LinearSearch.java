package gauravsirprograms;

import java.util.Scanner;

public class LinearSearch {
	
	public static void linearSearch(int arr[], int n) {
		for(int i = 0; i<arr.length; i++) {
			if(arr[i] == n)
				System.out.println("The search element "+n+ " is at position "+i);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the array elements");
		for(int i = 0; i<n; i++) 
			arr[i] = sc.nextInt();
		System.out.println("Enter the search element");
		int s = sc.nextInt();
		sc.close();
		linearSearch(arr,s);
	}

}

package gauravsirprograms;

import java.util.Scanner;

public class RemoveDuplicateElements {
	
	public static void removeDuplication(int arr[]) {
		
		for(int i = 0; i<arr.length-1; i++) {
			if(arr[i] != arr[i+1]) {
				System.out.print(arr[i] + " ");
			}
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
		sc.close();
		removeDuplication(arr);

	}

}

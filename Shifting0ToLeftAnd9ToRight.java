package gauravsirprograms;

import java.util.Scanner;

public class Shifting0ToLeftAnd9ToRight {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n = sc.nextInt(); int count = 0;
		int arr[] = new int[n];
		System.out.println("Enter the array elements");
		for(int i = 0; i<n; i++) 
			arr[i] = sc.nextInt();
		sc.close();
		for(int i = 0; i<n; i++) {
			if(arr[i] != 9)
				arr[count++] = arr[i];
		}
		while(count<n) {
			arr[count++] = 9;
		}
		System.out.println("The new array is ");
		for(int j = 0; j<arr.length; j++) {
			System.out.print(arr[j] + " ");
		}

	}

}

package gauravsirprograms;

import java.util.Scanner;

public class RemoveElementsFromArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the array elements");
		for(int i = 0; i<n; i++) 
			arr[i] = sc.nextInt();
		sc.close();
		int newa[] = new int[n-1];
		for(int i = 0; i<n; i++) {
			if(arr[i] == 28)
				continue;
			else {
				System.out.print(arr[i] + " ");
				newa[i] = arr[i];
			}	
		}
	}
}

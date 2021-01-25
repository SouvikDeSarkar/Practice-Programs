package gauravsirprograms;

import java.util.Scanner;

public class RotateElementsinArray {
	
	public static int[] rotateElements(int arr[], int n) {
		for(int i = 0; i<n; i++)
			rotateElementsByOne(arr);
		return arr;
	}
	
	public static void rotateElementsByOne(int arr[]) {
		int temp = arr[0];
		int n = arr.length;
		for(int i = 0; i<n-1; i++) {
			arr[i] = arr[i+1];
		}
		arr[n-1] = temp;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the array elements");
		for(int i = 0; i<n; i++) 
			arr[i] = sc.nextInt();
		System.out.println("Number of times the array needs to be rotated");
		int num = sc.nextInt();
		sc.close();
		int newarr[] = new int[arr.length];
		newarr = rotateElements(arr, num);
		for(int i = 0; i<newarr.length; i++)
			System.out.print(newarr[i]+ " , ");
	}

}

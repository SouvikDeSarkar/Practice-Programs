package gauravsirprograms;

import java.util.Scanner;

public class MaximunAndMinimumelements {
	
	public static int minElement(int arr[], int n) {
		int min = arr[0];
		for(int i = 0; i<arr.length; i++) {
			if(min>arr[i])
				min = arr[i];
		}
		return min;
	}
	public static int maxElement(int arr[], int n) {
		int max = arr[0];
		for(int i = 0; i<arr.length; i++) {
			if(max<arr[i])
				max = arr[i];
		}
		return max;
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
		int a[] = new int[4]; int c = 0;
		for(int i = 1; i<5; i++) {
			a[c++] = arr[i];
		}
		int max = maxElement(a,a.length);
		int min = minElement(a,a.length);
		System.out.println("maximum element is "+ max);
		System.out.println("minimum element is "+min);
	}

}

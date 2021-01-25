package gauravsirprograms;

import java.util.Scanner;

public class DifferenceBetweenMaxandMin {
	
	public static int maxElements(int arr[]) {
		int max = arr[0];
		for(int i = 0; i<arr.length; i++) {
			if(max < arr[i])
				max = arr[i];
		}
		return max;
	}
	
	public static int minElements(int arr[]) {
		int min = arr[0];
		for(int i = 0; i<arr.length; i++) {
			if(min > arr[i])
				min = arr[i];
		}
		return min;
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
		int max = maxElements(arr);
		System.out.println("The Maximum element is "+max);
		int min = minElements(arr);
		System.out.println("The Minimum element is "+min);
		int res = max - min;
		for(int i : arr) {
			if(i == res) {
				System.out.println("The difference between max and min is present in the array.");
				break;
			}
			else {
				System.out.println("The difference between max and min is  not present in the array.");
				break;
			}
		}
	}

}

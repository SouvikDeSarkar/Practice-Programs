package gauravsirprograms;

import java.util.Scanner;

public class SortingElements {
	
	public static int[] bubbleSort(int arr[]) {
		int n = arr.length;		int temp = 0;
		for(int i = 0; i<n-1; i++) {
			for(int j = 0; j<n-i-1; j++) {
				if(arr[j] > arr[j+1]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		return arr;
	}
	
	public static int[] selectionSort(int arr[]) {
		int n = arr.length; int temp = 0;
		for(int i = 0; i<n-1; i++) {
			int min = i;
			for(int j = i+1; j<n; j++) {
				if(arr[min] > arr[j]) {
					min = j;
				}
				temp = arr[min];
				arr[min] = arr[i];
				arr[i] = temp;
			}
		}
		return arr;
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
		int sortArr[] = new int[arr.length];
		sortArr = selectionSort(arr);
		for(int i = 0; i<sortArr.length; i++) {
			System.out.print(sortArr[i]+" , ");
		}

	}

}

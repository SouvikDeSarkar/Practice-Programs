package Coding;

public class MinSumMaxSum {
	
	public static void minMaxSum(int arr[]) {
		int min = arr[0];
		for(int i = 0; i<arr.length; i++) {
			if(min>arr[i])
				min = arr[i];
		}
		System.out.println(min);
		int max = arr[0];
		for(int i = 0; i<arr.length; i++) {
			if(max<arr[i])
				max = arr[i];
		}
		System.out.println(max);
		int totalSum = 0;
		for(int i = 0; i<arr.length; i++) {
			totalSum += arr[i];
		}
		System.out.println(totalSum);
		System.out.println("Minimum sum"+(totalSum-min));
		System.out.println("Minimum sum"+(totalSum-max));
	}

	public static void main(String[] args) {
		int arr[] = {1, 2, 3, 4, 5};
		minMaxSum(arr);

	}

}

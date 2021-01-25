package gauravsirprograms;

public class ThirdLargestElement {
	static void thirdLargest(int arr[],  int arr_size) { 
		if (arr_size < 3){ 
			System.out.printf(" Invalid Input "); 
			return; 
		} 
		// Find first largest element 
		int first = arr[0]; 
		for (int i = 1; i < arr_size ; i++) { 
			if (arr[i] > first) 
				first = arr[i]; 
		}
		// Find second largest element 
		int second = 0; 
		for (int i = 0; i < arr_size ; i++) { 
			if (arr[i] > second &&  arr[i] < first) 
				second = arr[i]; 
		}
		// Find third largest element 
		int third = 0; 
		for (int i = 0; i < arr_size ; i++) { 
			if (arr[i] > third &&  arr[i] < second) 
				third = arr[i]; 
		}
		// Find fourth largest element
		int fourth = 0;
		for (int i = 0; i < arr_size ; i++) { 
			if (arr[i] > fourth &&  arr[i] < third) 
				fourth = arr[i]; 
		}
		System.out.println( "Fourth Largest element "+fourth); 
} 
	public static void main(String[] args) {
		int arr[] = {23, 65, 12, 98, 34, 10, 55, 71};
		thirdLargest(arr, arr.length);
	}
}

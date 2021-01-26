package Coding;

public class MergeTwoSortedArray {
	
	public static int[] mergeTwoSortedArray(int  a[], int b[]) {
		int res[] = new int[a.length + b.length];
		int i = 0;
		int j = 0;
		int k = 0;
		
		while(i<a.length && j<b.length) {
			if(a[i]<b[j]) 
				res[k++] = a[i++];
			else 
				res[k++] = b[j++];
		}
		while(i<a.length) {
			res[k++] = a[i++];
		}
		while(j<b.length) {
		res[k++] = b[j++];
	}
		return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n[] = {1, 5, 9, 10, 15, 20};
		int m[] = {2, 3, 8, 13};
		int res[] = mergeTwoSortedArray(n,m);
		for(int i : res) {
			System.out.print(i + " , ");
		}

	}

}

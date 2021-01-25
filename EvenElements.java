package gauravsirprograms;

public class EvenElements {

	public static void main(String[] args) {
		int n = 30; int c =0;
		int[] bjs = new int[15];
		System.out.print("Even Numbers from 1 to "+n+" are: ");
		for (int i = 1; i <= n; i++) {
		   if (i % 2 == 0) {
			bjs[c] = i;
			c++;
		   }
		}
		System.out.println("count is "+ c);
		System.out.println("Elements in bjs array is : ");
		for(int j =0; j<15; j++)
			System.out.print(bjs[j] + " , ");
	}
}

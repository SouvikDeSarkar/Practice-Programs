package Coding;

public class StrairCaseProblem1 {
	//Top to Down
	public static int noOfStairs(int n) {
		if(n == 0)
			return 1;
		if(n == 1)
			return 1;
		if(n == 2)
			return 2;
		
		return noOfStairs(n-1) + noOfStairs(n-2) + noOfStairs(n-3);
	}
	//Down To Top
	public static int noOfStairsDT(int n) {
		int f[] = new int[n+1];
		f[0] = 1;
		f[1] = 1;
		f[2] = 2;
		for(int i = 3; i <= n; i++) {
			f[i] = f[i-1] + f[i-2] + f[i-3];
		}
		return  f[n];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		System.out.println(noOfStairs(n));
		System.out.println(noOfStairsDT(n));
	}

}

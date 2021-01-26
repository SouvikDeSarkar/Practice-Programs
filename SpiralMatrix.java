package Coding;

public class SpiralMatrix {
	  public static void spiralMatrixPrint(int[][] arr) {
		    int rows = arr.length;
		    int cols = arr[0].length;
		    int top = 0, bottom = rows - 1, left = 0, right = cols - 1;
		    if(rows==cols)
		    {
		    while (top <= bottom && left <= right) {
		      for (int i = left; i <= right; ++i) {
		        System.out.print(arr[top][i] + " ");
		      }
		      ++top;
		      for (int i = top; i <=bottom; ++i) {
		          System.out.print(arr[i][right]+ " ");
		      }
		      --right;
		      
		      for (int i = right; i >= left; --i) {
		          System.out.print(arr[bottom][i]+ " ");
		      }
		      --bottom;
		      for (int i = bottom; i >= top; --i) {
		          System.out.print(arr[i][left]+ " ");
		      }
		      ++left;  
		  }
		    }
		    else
		    	System.out.println("please give identical matrix as input");
		  }   
		  public static void main(String[] args) 
		  { 
		    int a[][] = { {1,2,3,4},
		                      {5,6,7,8},
		                     {9,10,11,12},
		                     {13, 14, 15, 16}};
		    spiralMatrixPrint(a); 
		  } 

}

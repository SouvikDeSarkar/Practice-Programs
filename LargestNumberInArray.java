package Coding;

import java.util.Arrays;
import java.util.Comparator;

public class LargestNumberInArray {

	public static String largestNumber(int num[]) {
		if(num.length == 0)
			return "";
		
		String sa[] = new String[num.length];
		for(int i = 0; i<num.length; i++) {
			sa[i] = Integer.toString(num[i]);
		}
		
		Arrays.sort(sa, new Comparator<String>(){
			public int compare(String a, String b) {
				String a1 = a+b;
				String a2 = b+a;
				return a2.compareTo(a1);
			}
		});
		if(sa[0].equals("0"))
			return "0";

	StringBuilder sb = new StringBuilder();
	for(String s : sa)
	{
		sb.append(s);
	}
	return sb.toString();
	}
	public static void main(String[] args) {
		int n[] = {3, 30, 34, 5, 9};
		System.out.println(largestNumber(n));
	}
}

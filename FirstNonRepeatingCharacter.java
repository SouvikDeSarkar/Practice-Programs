package Coding;

import java.util.HashMap;
import java.util.Map.Entry;

public class FirstNonRepeatingCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "AABCDBECF";
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for(int i = 0; i<input.length(); i++ ) {
			char ch = input.charAt(i);
			if(map.containsKey(ch)) {
				map.put(ch, map.get(ch)+1);
			}
			else
				map.put(ch, 1);
		}
		for(Entry<Character, Integer> entryset : map.entrySet()) {
			if(entryset.getValue() == 1) {
				System.out.println(entryset.getKey());
				break;
			}
		}
	}
}

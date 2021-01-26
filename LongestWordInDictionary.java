package Coding;

import java.util.Arrays;
import java.util.Vector;

public class LongestWordInDictionary {
    static boolean isSubSequence(String str1, String str2)  { 
        int m = str1.length(), n = str2.length(); 
        int j = 0; // For index of str1 (or subsequence)  
  
        for (int i = 0; i < n && j < m; i++)  { 
            if (str1.charAt(j) == str2.charAt(i)) { 
                j++; 
            } 
        } 
        // If all characters of str1  
        // were found in str2  
        return (j == m); 
    } 
// Returns the longest String  
// in dictionary which is a  
// subsequence of str.  
    static String findLongestString(Vector<String> dict, String str) { 
        String result = ""; 
        int length = 0; 
        // Traverse through all words of dictionary  
        for (String word : dict) {     
            // If current word is subsequence of str  
            // and is largest such word so far.  
            if (length < word.length() && isSubSequence(word, str))  { 
                result = word; 
                length = word.length(); 
            } 
        } 
        // Return longest String  
        return result; 
    } 
    // Driver code 
    public static void main(String[] args)  
    { 
        String[] arr = {"ale", "apple", "monkey", "plea"}; 
        Vector<String> dict = new Vector<String>(Arrays.asList(arr)); 
        String str = "abpcplea"; 
        System.out.println(findLongestString(dict, str)); 
    } 
}

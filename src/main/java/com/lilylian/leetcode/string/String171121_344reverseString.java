package com.lilylian.leetcode.string;


/**
 * 544. Output Contest Matches 
 */
public class String171121_344reverseString {
	
    public static String reverseString(String s) {
    	char[] cs = s.toCharArray();
    	int i = 0, j = s.length() - 1;
    	while(i < j){
    		char temp = cs[i];
    		cs[i] = cs[j];
    		cs[j] = temp;
    		i++;
    		j--;
    	}
        return new String(cs);
    }
    
    public static String reverseString2(String s) {
    	char[] cs = s.toCharArray();
        for(int i = 0, len = s.length(), mid = len >> 1; i < mid; i++){
            char temp = cs[i];
            cs[i] = cs[len-1-i];
            cs[len-1-i] = temp;
        }
        return new String(cs);
    }
    
    public static String reverseString3(String s) {
    	char[] cs = s.toCharArray();
    	for(int i = 0, j = s.length() - 1; i < j; i++,j--){
    		char temp = cs[i];
    		cs[i] = cs[j];
    		cs[j] = temp;
    	}
    	return new String(cs);
    }

	public static void main(String[] args) {
		System.out.println(reverseString("hello"));
		System.out.println(reverseString2("hello"));
		System.out.println(reverseString3("hello"));
	}
}

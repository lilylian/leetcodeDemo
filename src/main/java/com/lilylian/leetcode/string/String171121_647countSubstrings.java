package com.lilylian.leetcode.string;



/**
 * 647. Palindromic Substrings
 * 计算回文子串的数量
 * 
 */
public class String171121_647countSubstrings {
	
    public static int countSubstrings(String s) {
    	int count = 0;
    	for(int i = 0, len = s.length(); i < len; i++){
			for(int left = 0, end = left+i; end<=len; left++, end = left+i){
				String str = s.substring(left, end);
				if(new StringBuffer(str).reverse().toString().equals(str)) 
					count++;
			}
    	}
    	return count;
    }
    
	public static int countSubstrings2(String s) {
    	int count = 0;
    	for(int i = 0, len = s.length(); i < len; i++){
    		count += check(s, i, i);
    		count += check(s, i, i+1);
    	}
    	return count;
    }

	private static int check(String s, int left, int right) {
		char[] cs = s.toCharArray();
		int count = 0;
		while(left>=0 && right < s.length() && cs[left] == cs[right]){
			count++;
			left--;
			right++;
		}
		return count;
	}

	public static void main(String[] args) {
		System.out.println(countSubstrings("aba"));
	}
}

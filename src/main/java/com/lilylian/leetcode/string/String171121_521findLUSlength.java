package com.lilylian.leetcode.string;



/**
 * 521. Longest Uncommon Subsequence I
 */
public class String171121_521findLUSlength {
	
    public static int findLUSlength(String a, String b) {
    	if(a.equals(b)) return -1;
        return Math.max(a.length(), b.length());
    }

	public static void main(String[] args) {
		System.out.println(findLUSlength("aba", "cdc"));
	}
}

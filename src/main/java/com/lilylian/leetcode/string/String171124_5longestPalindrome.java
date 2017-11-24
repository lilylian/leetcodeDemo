package com.lilylian.leetcode.string;




/**
 * 5. Longest Palindromic Substring
 */
public class String171124_5longestPalindrome {
	
	/*my answer*/
	public static String longestPalindrome(String s) {
        if(s.length()==1)
			return s;
        String str = "";
        for(int i = 1, len = s.length(); i<len; i++){
        	String temp1 = check(s, i-1, i);
        	String temp2 = check(s, i, i);
        	str = temp1.length()>str.length()?temp1:str;
        	str = temp2.length()>str.length()?temp2:str;
        }
        return str;
    }
	
	public static String check(String s, int left, int right){
		while(left>=0&&right<s.length()&&s.charAt(left)==s.charAt(right)){
			left--;
			right++;
		}
		return s.substring(left+1, right);
	}
	/*blog answer*/
	public static String longestPalindrome2(String s) {
		if(s==null || s.length()==1) return s;
		String str = "";
        for(int i = 0, len = s.length(); i<len; i++){
        	String temp2 = check2(s, i, i);
        	String temp1 = check2(s, i, i+1);
        	if(temp1.length()>str.length())
        		str = temp1;
        	if(temp2.length()>str.length())
        		str = temp2;
        }
        return str;
    }
	
	public static String check2(String s, int left, int right){
		while(left>=0&&right<s.length()&&s.charAt(left)==s.charAt(right)){
			left--;
			right++;
		}
		return s.substring(left+1, right);
	}
	
	/*leetcode's answer */
	static int start = 0, end = 0;
	public static String longestPalindrome3(String s){
		if(s==null || s.length() == 1) return s;
		for(int i = 0, len = s.length(); i<len; i++){
			int len1 = subStringLen(s, i, i);
			int len2 = subStringLen(s, i, i+1);
			int l = Math.max(len1, len2);
			if(l > end - start + 1){
				start = i - (l-1)/2;
				end = i + l/2;
			}
		}
		return s.substring(start, end + 1);
	}
	
	public static int subStringLen(String s, int l, int r){
		while(l>=0 && r<s.length() && s.charAt(l) == s.charAt(r)){
			l--;
			r++;
		}
		return r-l-1;
	}

	public static void main(String[] args) {
		System.out.println("babad>>"+longestPalindrome3("a"));
		System.out.println("babad>>"+longestPalindrome3("babad"));
		System.out.println("cbbd>>"+longestPalindrome3("cbbd"));
	}
}

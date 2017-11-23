package com.lilylian.leetcode.string;



/**
 * 557. Reverse Words in a String III
 */
public class String171121_557reverseWords {
	
	public static String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuffer sb = new StringBuffer();
        for (String word : words) {
        	sb.append(new StringBuffer(word).reverse()).append(" ");
		}
        return sb.toString().toString().trim();
    }
	
	public static String reverseWords2(String s) {
		char[] cs = s.toCharArray();
		int i = 0;
		for(int j = 0; j < cs.length; j++){
			if(cs[j] == ' '){
				reverse(cs, i, j-1);
				i = j + 1;
			}
		}
		reverse(cs, i, cs.length-1);
		return new String(cs);
	}
	
	private static void reverse(char[] cs, int l, int r) {
		while(l < r){
			char temp = cs[l];
			cs[l] = cs[r];
			cs[r] = temp;
			l++;
			r--;
		}
	}

	public static void main(String[] args) {
		System.out.println(reverseWords("Let's     take LeetCode contest"));
	}
}

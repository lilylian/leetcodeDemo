package com.lilylian.leetcode.string;



/**
 * 696. Count Binary Substrings
 */
public class String171122_696countBinarySubstrings {
	
    public static int countBinarySubstrings(String s) {
        char[] cs = s.toCharArray();
        int tag0 = 0, tag1 = 0, count = 0;
        for(int i = 0, len = cs.length; i < len; i++){
        	if(tag0>0&&tag1>0&&cs[i-1]!=cs[i]){
        		count += Math.min(tag0, tag1);
        		if(cs[i] == '0') {
        			tag0 = 1;
        		}else{
        			tag1 = 1;
        		}
        	}else{
        		switch (cs[i]) {
	        		case '0': tag0++; break;
	        		case '1': tag1++; break;
	        		default: break;
        		}
        	}
        }
        count += Math.min(tag0, tag1);
        return count;
    }
    
	public static void main(String[] args) {
		System.out.println(countBinarySubstrings("00110011"));
		System.out.println(countBinarySubstrings("10101"));
	}
}

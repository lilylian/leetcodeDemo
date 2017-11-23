package com.lilylian.leetcode.string;

import java.util.HashMap;
import java.util.Map;

/**
 *  3. Longest Substring Without Repeating Characters
 */
public class String171121_3LengthOfLongestSubstring {
	
    public static int lengthOfLongestSubstring(String s) {
    	if(s == null || s.length() == 0) return 0;
    	Map<Character, Integer> map = new HashMap<Character, Integer>();
    	int head = 0;
    	int max = 0;
    	for(int i = 0, len = s.length(); i< len; i++){
    		Character c = s.charAt(i);
    		if(map.containsKey(c)){
    			head = Math.max(map.get(c)+1, head);
    		}
    		map.put(c, i);
    		max = Math.max(max, i-head+1);
    	}
    	return max;
    }
}

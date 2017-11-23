package com.lilylian.leetcode.string;

import java.util.ArrayList;
import java.util.List;

/**
 * 544. Output Contest Matches 
 */
public class String171121_544FindContestMatch {
	
    public static String findContestMatch(int n) {
    	List<String> list = new ArrayList<String>();
    	for(int i = 1; i <= n; i++){
    		list.add(String.valueOf(i));
    	}
    	while(list.size()>1){
    		n = list.size();
    		List<String> temp = new ArrayList<String>();
    		for(int i = 0, mid = list.size()/2; i < mid; i++){
    			temp.add("(" + list.get(i) + "," + list.get(n-1-i) + ")");
    		}
    		list = temp;
    	}
    	return list.get(0);
    }

	public static void main(String[] args) {
		System.out.println(findContestMatch(1<<4));
	}
}

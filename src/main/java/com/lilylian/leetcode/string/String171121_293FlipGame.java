package com.lilylian.leetcode.string;

import java.util.ArrayList;
import java.util.List;


/**
 * 293. Flip Game
 * 反转游戏
 */
public class String171121_293FlipGame {
	
    public static List<String> generatePossibleNextMoves(String s) {
    	char[] cs = s.toCharArray();
    	List<String> list = new ArrayList<String>();
    	for (int i = 0, len = cs.length, max = len-2; i <= max; i++) {
			if(cs[i] == '+' && cs[i+1] == '+'){
				cs[i] = '-';
				cs[i+1] = '-';
				list.add(new String(cs));
				cs[i] = '+';
				cs[i+1] = '+';
			}
		}
    	return list;
    }

	public static void main(String[] args) {
		System.out.println(generatePossibleNextMoves("+++++"));
		String[] testcase = {"+","-","++","--","+++","++++","+--+","-+-+","+-+-"};  
	    for(int i=0;i<testcase.length;i++){  
	        System.out.println(generatePossibleNextMoves(testcase[i]));  
	    } 
	}
}

package com.lilylian.leetcode.string;


/**
 * 657. Judge Route Circle 
 */
public class String171121_657judgeCircle {
	
    public static boolean judgeCircle(String moves) {
    	if(moves.length() % 2 != 0)
    		return false;
    	int x = 0, y = 0;
    	for(int i = 0, len = moves.length(); i < len; i++){
    		switch (moves.charAt(i)) {
				case 'R': x++;break;
				case 'L': x--;break;
				case 'U': y++;break;
				case 'D': y--;break;
				default: break;
			}
    	}
    	return x==0 && y==0;
    }

	public static void main(String[] args) {
		System.out.println(judgeCircle("UDLR"));
	}
}

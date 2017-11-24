package com.lilylian.leetcode.string;




/**
 * 6. ZigZag Conversion
 */
public class String171124_6convert {
	
	/*my answer*/
	public static String convert(String s, int numRows) {
		if(numRows == 1) return s;
        int len = s.length();
        int group = (numRows<<1)-2;
        int numCols = (len-1)/(numRows-1)+2;
        char[][] cs = new char[numRows][numCols];
        for (int i = 0; i < len; i++) {
			int r = i % group;
			int c = (i/group)*2;
			if(r >= numRows) {
				r = 2*numRows-r-2;
				c = c + 1;
			}
			cs[r][c] = s.charAt(i);
		}
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i<numRows; i++) {
			for(int j = 0; j < numCols;j++){
				if(cs[i][j] != '\0') sb.append(cs[i][j]);
			}
		}
        return sb.toString();
    }

	public static void main(String[] args) {
		System.out.println("babad>>"+convert("a", 2));
		System.out.println("babad>>"+convert("babad", 3));
		System.out.println("cbbd>>"+convert("cbbd", 3));
	}
}

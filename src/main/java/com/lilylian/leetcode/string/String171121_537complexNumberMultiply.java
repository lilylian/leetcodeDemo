package com.lilylian.leetcode.string;


/**
 * 537. Complex Number Multiplication
 */
public class String171121_537complexNumberMultiply {
	
    public static String complexNumberMultiply(String a, String b) {
    	// 较优
    	int ar, ai, br, bi;
    	ar = Integer.valueOf(a.substring(0, a.indexOf("+")));
    	ai = Integer.valueOf(a.substring(a.indexOf("+")+1, a.length()-1));
    	br = Integer.valueOf(b.substring(0, b.indexOf("+")));
    	bi = Integer.valueOf(b.substring(b.indexOf("+")+1, b.length()-1));
    	return (ar * br - ai * bi) + "+" + (ar*bi+ai*br) + "i";
    }
    
    public static String complexNumberMultiply2(String a, String b) {
    	String[] x = a.split("\\+|i");
    	String[] y = b.split("\\+|i");
    	int ar = Integer.parseInt(x[0]);
    	int ai = Integer.parseInt(x[1]);
    	int br = Integer.parseInt(y[0]);
    	int bi = Integer.parseInt(y[1]);
    	return (ar * br - ai * bi) + "+" + (ar*bi+ai*br) + "i";
    }

	public static void main(String[] args) {
		System.out.println(complexNumberMultiply("1+-1i", "1+-1i"));
	}
}

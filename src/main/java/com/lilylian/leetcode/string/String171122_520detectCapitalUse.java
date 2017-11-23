package com.lilylian.leetcode.string;



/**
 * 520. Detect Capital
 */
public class String171122_520detectCapitalUse {
	
    public static boolean detectCapitalUse(String word) {
    	String upperCase = word.toUpperCase();
    	if(upperCase.equals(word))
    		return true;
    	String lowerCase = word.toLowerCase();
    	if(lowerCase.equals(word))
    		return true;
    	return (word.substring(0, 1).toUpperCase()+word.substring(1).toLowerCase()).equals(word);
    }
    
    public static boolean detectCapitalUse2(String word) {
    	char[] cs = word.toCharArray();
    	int upper = 0, lower = 0;
    	for (int i = 0, len = cs.length; i < len; i++) {
    		if(cs[i] > 'Z'){
    			lower++;
    		}else{
    			upper++;
    		}
		}
    	return (upper>0&&lower==0 || upper==0&&lower>0 || upper==1&&cs[0]<'a');
    }
    

	public static void main(String[] args) {
		System.out.println(detectCapitalUse2("USA"));
		System.out.println(detectCapitalUse2("leetcode"));
		System.out.println(detectCapitalUse2("Google"));
		System.out.println(detectCapitalUse2("FlaG"));
	}
}

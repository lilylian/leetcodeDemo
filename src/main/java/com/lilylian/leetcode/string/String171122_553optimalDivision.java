package com.lilylian.leetcode.string;



/**
 * 553. Optimal Division
 * 最佳除法
 */
public class String171122_553optimalDivision {
	
    public static String optimalDivision1(int[] nums) {
    	StringBuffer sb = new StringBuffer();
    	sb.append(nums[0]);
        for(int i = 1, len = nums.length; i < len; i++){
        	if(len == 2){
        		sb.append("/"+nums[i]);
        		break;
        	}
        	if(i == 1) {
        		sb.append("/("+nums[i]);
        	} else if(i < len -1) {
        		sb.append("/"+nums[i]);
        	} else {
        		sb.append("/"+nums[i]+")");
        	}
        }
        return sb.toString();
    }
    
    public static String optimalDivision2(int[] nums) {
    	int len = nums.length;
    	if(len == 1)
    		return nums[0]+"";
    	if(len == 2)
    		return nums[0] + "/" + nums[1];
    	StringBuffer res = new StringBuffer();
    	res.append(nums[0]+"/(" + nums[1]);
    	for(int i = 2; i < len; i++){
    		res.append("/"+nums[i]);
    	}
    	res.append(")");
    	return res.toString();
    }

	public static void main(String[] args) {
		int[] iarr = {1000,100,10,2};
		System.out.println(optimalDivision1(iarr));
	}
}

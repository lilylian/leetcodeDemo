package com.lilylian.leetcode.string;



/**
 * 606. Construct String from Binary Tree
 * 将Tree构造成结构字符串
	
	Input: Binary tree: [1,2,3,4]
	       1
	     /   \
	    2     3
	   /    
	  4     
	
	Output: "1(2(4))(3)"
	
	Explanation: Originallay it needs to be "1(2(4)())(3()())", 
	but you need to omit all the unnecessary empty parenthesis pairs. 
	And it will be "1(2(4))(3)".
	
	
	Input: Binary tree: [1,2,3,null,4]
	       1
	     /   \
	    2     3
	     \  
	      4 
	
	Output: "1(2()(4))(3)"
	
	Explanation: Almost the same as the first example, 
	except we can't omit the first parenthesis pair to break the one-to-one mapping relationship between the input and the output.

 */
public class String171123_606tree2str {
	
	/**
	 * My answer
	 */
    public static String tree2str(TreeNode t) {
    	if(t == null) 
    		return "";
        StringBuffer ans = new StringBuffer();
        ans.append(t.val);
        if(t.right != null){
        	ans.append("(").append(tree2str(t.left)).append(")(").append(tree2str(t.right)).append(")");
        }else if(t.left != null){
        	ans.append("(").append(tree2str(t.left)).append(")");
        }
        return ans.toString();
    }
    
    /**
     * leetcode answer.
     * better
     */
    public static String tree2str2(TreeNode t) {
    	if(t == null) 
    		return "";
    	if(t.left == null && t.right == null)
    		return t.val + "";
    	if(t.right == null)
    		return t.val+"("+tree2str(t.left)+")";
    	return t.val+"("+tree2str(t.left)+")("+tree2str(t.right)+")";
    }
    
	public static void main(String[] args) {
		TreeNode t1 = new TreeNode(1, new TreeNode(2, new TreeNode(4), null), new TreeNode(3));
		TreeNode t2 = new TreeNode(1, new TreeNode(2, null, new TreeNode(4)), new TreeNode(3));
		
		System.out.println(tree2str2(t1));
		System.out.println(tree2str2(t2));
	}
}
class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int x) { val = x; }
	TreeNode(int x, TreeNode left, TreeNode right) { val = x; this.left = left; this.right = right;}
}
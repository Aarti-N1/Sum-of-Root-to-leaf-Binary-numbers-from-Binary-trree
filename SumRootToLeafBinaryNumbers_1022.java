package easy;

import general.TreeNode;

public class SumRootToLeafBinaryNumbers_1022 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	  int overallSum = 0;
	    public int sumRootToLeaf(TreeNode root) {
	        //preorder traversal
	        sumHelper(root, 0);
	        return overallSum;
	        
	    }
	    public void sumHelper(TreeNode root, int partialNumber){
	        if(root!= null)
	            partialNumber = partialNumber * 2 + root.val;
	        else
	            return;
	        if(root.left == null && root.right == null){
	           
	            overallSum=overallSum + partialNumber;
	            return;
	    //        return overallSum;
	        }
	       
	        sumHelper(root.left, partialNumber);
	        sumHelper(root.right, partialNumber);
	    }
}

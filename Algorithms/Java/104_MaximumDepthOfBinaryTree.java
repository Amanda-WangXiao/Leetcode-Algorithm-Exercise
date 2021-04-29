/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {	//	0 ms	38.2 MB
	public int maxDepth(TreeNode root) {
		if(root == null) return 0;
		int left_len = maxDepth(root.left);
		int right_len = maxDepth(root.right);
		return Math.max(left_len,right_len)+1;
	}
}
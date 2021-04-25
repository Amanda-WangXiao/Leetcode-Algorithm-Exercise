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
class Solution {	//	0 ms	36.2 MB
	Queue<TreeNode> queue = new LinkedList<TreeNode>();
	public TreeNode increasingBST(TreeNode root) {
		inorder(root);
		TreeNode first = new TreeNode();
		TreeNode p;
		p=first;
		while(!queue.isEmpty()){
			TreeNode node = new TreeNode(queue.poll().val);
			p.right=node;
			p=node;
		}
		return first.right;
	}

	public void inorder(TreeNode node){
		if(node.left!=null) inorder(node.left);
		queue.offer(node);
		if(node.right!=null) inorder(node.right);
	}
}
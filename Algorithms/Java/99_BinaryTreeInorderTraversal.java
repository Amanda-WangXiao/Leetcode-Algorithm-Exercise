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
class Solution {    //  0 ms    36.9 MB

    List<Integer> in_list = new ArrayList<Integer>();

    public List<Integer> inorderTraversal(TreeNode root) {
        if(root!=null) inorder(root);
        return in_list;
    }

    public void inorder(TreeNode root){
        if(root.left!=null) inorder(root.left);
        in_list.add(root.val);
        if(root.right!=null) inorder(root.right);
    }
}
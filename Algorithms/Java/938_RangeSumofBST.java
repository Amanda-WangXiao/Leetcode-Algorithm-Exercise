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
class Solution {    //  1 ms    46.7 MB
    int sum = 0;
    public int rangeSumBST(TreeNode root, int low, int high) {
        inorder(root,low,high);
        return sum;
    }

    public void inorder(TreeNode node,int low, int high){
        if(node.left!=null) inorder(node.left,low,high);
        if(node.val>=low && node.val<=high) sum=sum+node.val;
        if(node.right!=null) inorder(node.right,low,high);
    }
}

class Solution {    //  0 ms    46.7 MB
    int sum = 0;
    public int rangeSumBST(TreeNode root, int low, int high) {
        if(root.val>high) inorder(root.left,low,high);
        else if(root.val<low)  inorder(root.right,low,high);
        else inorder(root,low,high);
        return sum;
    }

    public void inorder(TreeNode node,int low, int high){
        if(node.left!=null) inorder(node.left,low,high);
        if(node.val>=low && node.val<=high) sum=sum+node.val;
        if(node.right!=null) inorder(node.right,low,high);
    }
}
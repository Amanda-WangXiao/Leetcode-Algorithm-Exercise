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
class Solution {    //  0 ms    36.1 MB

    List<Integer> in_list = new ArrayList<Integer>();

    public int minDiffInBST(TreeNode root) {
        int min = 100001;

        inorder(root);
        for(int i=1;i<in_list.size();i++){
            min=(in_list.get(i)-in_list.get(i-1))<min?(in_list.get(i)-in_list.get(i-1)):min;
        }
        return min;
    }

    public void inorder(TreeNode root){
        if(root.left!=null) inorder(root.left);
        in_list.add(root.val);
        if(root.right!=null) inorder(root.right);
    }
}
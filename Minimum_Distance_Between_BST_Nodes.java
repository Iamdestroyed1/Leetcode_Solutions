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

public class Minimum_Distance_Between_BST_Nodes {
    
    public ArrayList<Integer> lol=new ArrayList<Integer>();
    
    public void getNodes(TreeNode root){
        
        if(root==null){
            return;
        }
        getNodes(root.left);
        lol.add(root.val);
        getNodes(root.right);
    }
    
    public int minDiffInBST(TreeNode root) {
        
        getNodes(root);
        int ans=Integer.MAX_VALUE;
        for(int i=1;i<lol.size();i++){
            ans=Math.min(ans,Math.abs(lol.get(i)-lol.get(i-1)));
        }
        return ans;
        
       
        
        
        
        
        
        
    }
}

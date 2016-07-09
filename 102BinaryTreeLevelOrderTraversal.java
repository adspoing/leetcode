/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res=new LinkedList<List<Integer>>();  
        if(root==null)
            return res;
        LinkedList<TreeNode> q=new LinkedList<TreeNode>();
        q.add(root);
        while(!q.isEmpty())
        {
            LinkedList<Integer>oneLevel=new LinkedList<Integer>();
            int size=q.size();
            for(int i=0;i<size;i++){
                TreeNode tmp=q.remove();
                oneLevel.add(tmp.val);
                if(tmp.left!=null) q.add(tmp.left);
                if(tmp.right!=null) q.add(tmp.right);
            }
            res.add(oneLevel);
        }
        return res;
    }
}
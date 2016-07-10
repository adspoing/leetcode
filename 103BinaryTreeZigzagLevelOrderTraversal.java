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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>>res=new LinkedList<List<Integer>>();
        LinkedList<TreeNode> q=new LinkedList<TreeNode>();
        if(root==null)
            return res;
        q.add(root);
        boolean flag=false;
        while(!q.isEmpty()){
            LinkedList<Integer> level=new LinkedList<Integer>();
            int size=q.size();
            for(int i=0;i<size;i++){
                TreeNode tmp=q.remove();
                if(flag==true)
                    level.add(0,tmp.val); 
                else
                    level.add(tmp.val);
                if(tmp.left!=null) q.add(tmp.left);
                if(tmp.right!=null) q.add(tmp.right);
            }
            flag=!flag;
            res.add(level);
        }
        return res;
    }
}
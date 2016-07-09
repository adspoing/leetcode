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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res= new LinkedList<Integer>();
        LinkedList<TreeNode> q= new LinkedList<TreeNode>();
        if(root==null)
            return res;
        q.add(root);
        while(!q.isEmpty())
        {
            int size=q.size();
            int levelNum=0;
            for(int i=0;i<size;i++)
            {
                TreeNode tmp=q.remove();
                levelNum=tmp.val;
                if(tmp.left!=null) q.add(tmp.left);
                if(tmp.right!=null) q.add(tmp.right);
            }
            res.add(levelNum);
        }
        return res;
    }
}
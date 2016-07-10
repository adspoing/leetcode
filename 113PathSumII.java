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
 public static List<List<Integer>> pathSum(TreeNode root, int sum) {
            List<List<Integer>> res = new LinkedList<List<Integer>>();
            if(root==null)
                return res;
            LinkedList<Integer>path= new LinkedList<Integer>();
            travel(root,sum,res,path);
            return res;
        }
        public static void travel(TreeNode t, int sum,List<List<Integer>> res,LinkedList<Integer>path)
        {
            if(t==null)return;
            path.add(t.val);
            if(t.left==null && t.right==null && sum==t.val){
                res.add(new LinkedList(path));
            }else
            {
                travel(t.left,sum-t.val,res,path);
                travel(t.right,sum-t.val,res,path);
            }
            path.remove(path.size()-1);
        }
}
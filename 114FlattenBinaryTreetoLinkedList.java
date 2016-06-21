public class Solution {
    public void flatten(TreeNode root) {
         mflatten(root);
    }
    public TreeNode mflatten(TreeNode root)
    {
        if(root==null)
        return root;
        if(root.left==null&&root.right==null)
        return root;
        TreeNode left=root.left;
        TreeNode right=root.right;
        root.left=null;
        if(left!=null)
        {
            root.right=left;
            TreeNode tmp=mflatten(left);
            tmp.left=null;
            if(right!=null)
               tmp.right=right;
             else
               return tmp;
        }
        return mflatten(right);
    }
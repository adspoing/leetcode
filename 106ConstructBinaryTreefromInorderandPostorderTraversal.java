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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        return getTree(inorder,0,inorder.length-1,postorder,0,postorder.length-1);
    }
    TreeNode getTree(int[] inorder,int startIn,int endIn,int[] postorder,int startPos,int endPos)
    {
        if(startIn>endIn||startPos>endPos)
            return null;
        int val=postorder[endPos];
        TreeNode root = new TreeNode(val);
        int mid=0;
        for(int i=startIn;i<=endIn;i++){
            if(inorder[i]==val)
            {
                mid=i;
                break;
            }
        }
        root.left=getTree(inorder,startIn,mid-1,postorder,startPos,startPos+mid-startIn-1);
        root.right=getTree(inorder,mid+1,endIn,postorder,startPos+mid-startIn,endPos-1);
        return root;
    }
}
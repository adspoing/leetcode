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
    public List<Integer> preorderTraversal(TreeNode root) {
        Stack<TreeNode> stack = new Stack<TreeNode>();
        List<Integer> preOrder = new ArrayList<Integer>();
        
        if( root ==null)
            return preOrder;
        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode node= stack.pop();
            preOrder.add(node.val);
            if(node.right!=null) stack.push(node.right);
            if(node.left!=null) stack.push(node.left);
        }
        return preOrder;
    }
}

//分治法
public class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
      List<Integer> result = new LinkedList<Integer>();
      
      if(root == null){
          return result;
      }
      List<Integer>left = preorderTraversal(root.left);
      List<Integer>right = preorderTraversal(root.right);
      
      result.add(root.val);
      result.addAll(left);
      result.addAll(right);
      return result;
    }
}
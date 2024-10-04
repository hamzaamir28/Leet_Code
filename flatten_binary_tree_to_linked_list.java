import java.util.Stack;

import javax.swing.tree.TreeNode;

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
public class flatten_binary_tree_to_linked_list {
    public void flatten(TreeNode root) {
        if(root == null) return;

        Stack<TreeNode> stack = new Stack();

        stack.push(root);

        while(!stack.isEmpty()){
            TreeNode curr = stack.pop();
            if(curr.right != null){
                stack.push(curr.right);
            }
            if(curr.left != null){
                stack.push(curr.left);
            }

            if(!stack.isEmpty()){
                curr.right = stack.peek();
            }

            curr.left = null;
        }
        
    }
}

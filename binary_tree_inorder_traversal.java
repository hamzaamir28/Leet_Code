import java.util.ArrayList;
import java.util.List;
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
public class binary_tree_inorder_traversal {
    public List<Integer> inorderTraversal(TreeNode root) {
		  List<Integer> output_arr = new ArrayList<Integer>();
		  Stack<TreeNode> stack = new Stack<TreeNode>();
		  TreeNode node = root;
		  if(root == null) {
			  return output_arr;
		  }
		  while(node != null || !stack.isEmpty()) {
			  while(node != null) {
				  stack.push(node);
				  node = node.left;
			  }
			  node = stack.pop();
			  output_arr.add(node.val);
			  node = node.right;
		  }  
		return output_arr;
    }
}

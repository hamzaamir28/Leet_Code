import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

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
public class maximum_depth_of_binary_tree {
    public int maxDepth(TreeNode root) {
         List<List<Integer>> result = new ArrayList<>();
		  if(root == null) {
			  return 0;
		  }
		  Queue<TreeNode> q = new LinkedList<>();
		  q.add(root);
		  
		  while(!q.isEmpty()) {
			  int size = q.size();
			  List<Integer> current_level = new ArrayList<>();
			  for(int i = 0; i < size; i++) {
				  TreeNode current = q.remove();
				  current_level.add(current.val);
				  if(current.left != null) {
					  q.add(current.left);
				  }
				  if(current.right != null) {
					  q.add(current.right);
				  }
			  }
			  result.add(current_level);
		  }
		return result.size();
    }
}

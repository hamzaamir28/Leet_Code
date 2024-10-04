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
public class sum_root_to_leaf_numbers {
    private int sum = 0;
    
    public int sumNumbers(TreeNode root) {
        dfs(root, 0);
        return sum;
    }

    private void dfs(TreeNode node, int currentSum) {
        if (node == null) {
            return;
        }

        currentSum = currentSum * 10 + node.val;

        if (node.left == null && node.right == null) {
            sum += currentSum;
        }

        dfs(node.left, currentSum);
        dfs(node.right, currentSum);
    }
}

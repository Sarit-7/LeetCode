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
class Solution {
    private int max; // Class-level variable to store the maximum path sum

    public int maxPathSum(TreeNode root) {
        max = Integer.MIN_VALUE; // Initialize max
        maxPath(root); // Start DFS traversal
        return max; // Return the result
    }

    private int maxPath(TreeNode node) {
        if (node == null) return 0;

        // Compute the maximum path sum starting from left and right children
        int left = Math.max(maxPath(node.left), 0);
        int right = Math.max(maxPath(node.right), 0);

        // Update the global maximum path sum
        max = Math.max(max, node.val + left + right);

        // Return the maximum path sum extending from this node
        return node.val + Math.max(left, right);
    }
}

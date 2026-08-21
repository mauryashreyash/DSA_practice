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
    String answer = null;

    public String smallestFromLeaf(TreeNode root) {
        dfs(root, new StringBuilder());
        return answer;
    }

    private void dfs(TreeNode node, StringBuilder path) {
        if (node == null) {
            return;
        }

        path.append((char) ('a' + node.val));

        if (node.left == null && node.right == null) {
            String current = path.reverse().toString();

            if (answer == null || current.compareTo(answer) < 0) {
                answer = current;
            }

            path.reverse();
        }

        dfs(node.left, path);
        dfs(node.right, path);

        path.deleteCharAt(path.length() - 1);
    }
}
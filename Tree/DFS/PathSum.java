//112
public class PathSum {
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
    }
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null){
            return false;
        }

        if(root.val == targetSum && root.left == null && root.right == null){
            return true;
        }

        return hasPathSum(root.left, targetSum-root.val) || hasPathSum(root.right, targetSum-root.val);
    }
}

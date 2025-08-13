// 543

public class DiameterBinaryTree {
    public class TreeNode {
      TreeNode left;
      TreeNode right;
    
  }
   int diameter  = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        height(root);
        return diameter -1 ;
    }

    int height(TreeNode root){
        if(root == null){
            return 0;
        }

        int leftheight = height(root.left);
        int rightheight = height(root.right);

        int dia = leftheight + rightheight + 1;
        diameter = Math.max(diameter,dia);

        return Math.max(leftheight,rightheight) +1;
    }
}

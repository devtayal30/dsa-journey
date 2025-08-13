// 993

import java.util.LinkedList;
import java.util.Queue;


public class CousinsBinaryTree {
    public static class TreeNode {
        
        int val;
        TreeNode left;
        TreeNode right;

        
    }
    public boolean isCousins(TreeNode root, int x, int y) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()){
            int levelsize = queue.size();
            boolean x_found = false, y_found = false;

            for(int i=0; i<levelsize;i++){
                TreeNode currentNode = queue.poll();

                if(currentNode.left != null && currentNode.right != null && ((currentNode.left.val  == x && currentNode.right.val == y) || (currentNode.left.val == y && currentNode.right.val == x))){
                    return false;
                }

                if(currentNode.val == x) x_found = true;

                if(currentNode.val == y) y_found = true;

                if(currentNode.left != null) queue.offer(currentNode.left);
                if(currentNode.right != null) queue.offer(currentNode.right);
     }
                if(x_found && y_found) return true;

                if(x_found || y_found) return false;
            

        }
        return false;
    }
}

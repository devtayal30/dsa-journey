// 102

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrderTraversal {

        public static class TreeNode {
        
        int val;
        TreeNode left;
        TreeNode right;

        
    }

        public List<List<Integer>> levelOrder(TreeNode root) {
         
        List<List<Integer>> result = new ArrayList<>();
        
        if(root == null){
            return result;
        }
        
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()){
            int levelsize = queue.size();
            List<Integer> currentlevel = new ArrayList<>(levelsize);

            for(int i=0; i<levelsize; i++){
                TreeNode currentnode = queue.poll();
                currentlevel.add(currentnode.val);
                if(currentnode.left != null){
                    queue.offer(currentnode.left);
                }
                if(currentnode.right != null){
                    queue.offer(currentnode.right);
                }
            }
            result.add(currentlevel);
        }

        return result;
    }
}

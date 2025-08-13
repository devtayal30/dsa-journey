import java.util.Scanner;

public class Traversal extends BinaryTree{
    public void preOrder(){
        preOrder(root);
    }

    private void preOrder(Node node){
        if(node == null){
            return;
        }
        System.out.println(node.value + " ");
        preOrder(node.left);
        preOrder(node.right);
    }


    public void inOrder(){
        inOrder(root);
    }

    private void inOrder(Node node){
        if(node == null){
            return;
        }
        inOrder(node.left);
        System.out.println(node.value + " ");
        inOrder(node.right);
    }


    public void postOrder(){
        postOrder(root);
    }

    private void postOrder(Node node){
        if(node == null){
            return;
        }
        
        postOrder(node.left);
        postOrder(node.right);
        System.out.println(node.value + " ");
    }

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Traversal tree = new Traversal();
    tree.populate(scanner);
    tree.preOrder();
    tree.prettyDisplay(); 
  }
}

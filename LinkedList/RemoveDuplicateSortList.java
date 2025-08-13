// leetcode -> 83
class LL{
    private Node head;
    private Node tail;
    public LL() {
    }
        private class Node {
        private final int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

    }
        public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }
    }

    public void insertLast(int val) {

        if (tail == null) {
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
    }
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }
   
    public void duplicate(){
        Node node = head;
        while(node.next != null){
            if(node.value == node.next.value){
                node.next = node.next.next;
            } else{
                node = node.next;
            }
        }
        tail = node;
        tail.next = null;
    }
}



public class RemoveDuplicateSortList {
     
    
    public static void main(String[] args) {
        LL list = new LL();
        list.insertLast(1);
        list.insertLast(1);
        list.insertLast(2);
        list.insertLast(2);
        list.insertLast(3);
        list.insertLast(3);

        list.display();
        list.duplicate();
        list.display();
    }
}

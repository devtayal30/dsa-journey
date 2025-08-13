// LEETCODE 141
public class CycleinLL {
    public boolean hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while(fast != null && fast.next != null){
            
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                return true;
            }
        }
       return false;
    }

   
    // lenght of cycle 
    public int lengthCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while(fast != null && fast.next != null){
            
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                // calculate the length
                ListNode temp = slow;
                int len = 0;
                do { 
                    temp = temp.next;
                    len++;
                } while (temp != slow);

                return len;
            }
        }
       return 0;
    }
    
    class ListNode {
     int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
   }
    public static void main(String[] args) {
        
    }

    
}

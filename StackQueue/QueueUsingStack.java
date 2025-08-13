//232

// insertion good 
import java.util.Stack;

class MyQueue {
        private Stack<Integer> first;
        private Stack<Integer> second;
        
        public MyQueue(){
            first = new Stack<>();
            second = new Stack<>();
        }
    
    
    public void push(int x) {
        first.push(x);
    }
    
    public int pop() {
        while(!first.isEmpty()){
            second.push(first.pop());
        }
        int removed = second.pop();
        while(!second.isEmpty()){
            first.push(second.pop());
        }
        return removed;
    }
    
    public int peek() {
        while(!first.isEmpty()){
            second.push(first.pop());
        }
        int peeked = second.peek();
        while(!second.isEmpty()){
            first.push(second.pop());
        }
        return peeked;
    }
    
    public boolean empty() {
        return first.isEmpty();
    }
}



// make remove efficient

// class MyQueue {
//         private Stack<Integer> first;
//         private Stack<Integer> second;
        
//         public MyQueue(){
//             first = new Stack<>();
//             second = new Stack<>();
//         }
    
    
//     public void push(int x) {
//         while(!first.isEmpty()){
//             second.push(first.pop());
//         }
//         first.push(x);
//         while(!second.isEmpty()){
//             first.push(second.pop());
//         }
//     }
    
//     public int pop() {
//         return first.pop();
//     }
    
//     public int peek() {
//        return first.peek();
//     }
    
//     public boolean empty() {
//         return first.isEmpty();
//     }
// }
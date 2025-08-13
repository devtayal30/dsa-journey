public class DynamicStack extends CustomStack{
    
    public DynamicStack(){
      super(); // call customstack()
    }

    public DynamicStack(int size){
      super(size); // call customstack(int size)
    }

    @Override
    public boolean push(int item){
        // full
        if(this.isFull()){
            // double the arr size
            int[] temp = new int[data.length * 2];
            
            // copy all previous item in new data
            for (int i = 0; i < data.length; i++) {
                temp[i] = data[i];
            }
            data = temp;
        }

        // insert item
        return super.push(item);
    }

    public static void main(String[] args) throws Exception {
        DynamicStack stack = new DynamicStack(5);

        stack.push(34);
        stack.push(45);
        stack.push(2);
        stack.push(9);
        stack.push(18);
        stack.push(47);
        stack.push(470);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}

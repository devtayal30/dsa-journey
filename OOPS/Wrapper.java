public class Wrapper {
    public static void main(String[] args) {
       Integer a = 10;
       Integer b = 20;
       swap(a,b);
       System.out.println(a + " " + b);

       //Integer num = new Integer(45);

       //final int bonus = 2;
       final A kunal = new A("kunal");
       kunal.name = "other name";
    
       
       //when a non primitve is final, you cannot reassign it
       //kunal = new A("new object");  // error

       A obj;
       for(int i=0 ; i< 1000000000; i++){
          obj = new A("Random name");
       }
       
    }
    
    static void swap (Integer a , Integer b){
        Integer temp = a;
        a = b;
        b = temp;
    }
     
    
}


class A {
    final int num = 10; 
    String name;

    public A(String name){
       // System.out.println("object created");
        this.name = name;
    }

   @Override
   protected void finalize() throws Throwable{
    System.out.println("Object is destroyed");
   }
}
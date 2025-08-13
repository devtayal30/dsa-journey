public class MessageProgram {
    public static void main(String[] args) {
        // write a fun that pritn hello world
        message();
    }

    static void message(){
        System.out.println("Hello world");
        message1();
    } 

    static void message1(){
        System.out.println("Hello world");
        message2();
    }

    static void message2(){
        System.out.println("Hello world");
    }
}
 
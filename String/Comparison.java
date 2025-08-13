public class Comparison {
    public static void main(String[] args) {
        String a = "Dev";// 
        String b = "Dev";
        
        // = =

        System.out.println( a == b);
        System.out.println(a.equals(b));
        

        String name1 = new String("Dev"); 
        String name2= new String("Dev");


        System.out.println(name1 == name2);
        System.out.println(name1.equals(name2));


    }
}

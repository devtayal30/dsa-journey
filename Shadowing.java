public class Shadowing {
    static int x = 90;  // this will be shadowed at line 6
    public static void main(String[] args) {
        System.out.println(x);
        int x = 40;
        System.out.println(x); // SCPOE WILL BEGIN WHEN VALUE IS INITIALISED
        fun();
    }

    static void fun(){
        System.out.println(x);
    }
}


// shadowing is a pratice of using two var with same name within same scope overlap
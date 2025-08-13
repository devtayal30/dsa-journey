public class Fibonaaci {
    public static void main(String[] args) {
        
        // for printing fibonnaci series
        // for (int i = 0; i < 100; i++) {
        //     int ans = fiboformula(i);
        //     System.out.println(ans);
        // }
        
        // for find particular no at particular index
        System.out.println(fiboformula(50));
    }

    static int fiboformula(int n) {
        return (int) (Math.pow(((1 + Math.sqrt(5)) / 2), n) / Math.sqrt(5));
    }

    static int fibo(int n) {

        if (n < 2) {
            return n;
        }

        return (fibo(n - 1) + fibo(n - 2));
    }
}

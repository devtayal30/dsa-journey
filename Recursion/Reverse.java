public class Reverse {
    public static void main(String[] args) {
        // way1(1234);
        // System.out.println(sum);

        System.out.println(way2(12345));
    }

    static int sum = 0;

    static void way1(int n){
        if(n == 0){
            return;
        }
        int rem = n % 10;
        sum = sum * 10 + rem;
        way1(n/10);
    }

    static int way2(int n){
        int digits = (int)(Math.log10(n)) +1;
        return helper(n,digits);
    }

    private static int helper(int n, int digits){
        if(n%10 == n){
            return n;
        }
        int rem = n % 10;
        return rem*(int)Math.pow(10,digits-1) + helper(n/10, digits-1);
    }
}

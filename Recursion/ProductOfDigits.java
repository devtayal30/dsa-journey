public class ProductOfDigits {
    public static void main(String[] args) {
         int ans = pro(55);
        System.out.println(ans);
    }

    static int pro(int n){
        if(n == 0){
            return 1;
        }

        return (n%10) * pro(n/10);
    }
}

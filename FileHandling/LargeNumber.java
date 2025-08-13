
import java.math.BigInteger;

public class LargeNumber {
    public static void main(String[] args) {
        int a = 30;
        int b = 67;

        BigInteger A = BigInteger.valueOf(33);
        BigInteger B = BigInteger.valueOf(3);
        BigInteger C = new BigInteger("232454435353");
        BigInteger X = new BigInteger("657634656");

        // constants
        BigInteger D = BigInteger.ONE;

        //add
        BigInteger S = C.add(X);

        BigInteger m = C.multiply(X);

        BigInteger sub = C.subtract(X);
        
        BigInteger d = C.divide(X);

        BigInteger rem = C.remainder(X);

        if(X.compareTo(C) < 0)
        System.out.println("Yes");
    }
}

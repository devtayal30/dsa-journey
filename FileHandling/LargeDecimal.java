import java.math.BigDecimal;

public class LargeDecimal {
    public static void main(String[] args) {
        BigDecimal X  = new BigDecimal("0.03");
        BigDecimal Y  = new BigDecimal("0.04");
        BigDecimal ans = Y.subtract(X);
        //System.out.println(ans);

        BigDecimal a  = new BigDecimal("1.456462353453456");
        BigDecimal b  = new BigDecimal("34235435.34353453");

        System.out.println(b.add(a));
        System.out.println(b.subtract(a));
        System.out.println(b.multiply(a));
        System.out.println(b.pow(2));
        System.out.println(b.negate());

        BigDecimal one = BigDecimal.ONE;
        System.out.println(one);
    }
}



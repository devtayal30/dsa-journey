public class Ibit {
    public static void main(String[] args) {
        int N = 12;
        int n = 4;
        System.out.println(ans(N,n));

    }

    static int ans(int N, int n) {
      return (N & (1 << (n - 1))) != 0 ? 1 : 0;
    }
}

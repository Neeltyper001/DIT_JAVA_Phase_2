package BitManupulation;

public class Prod2_5 {
    // product with 2.5

    public static void main(String[] args) {
        int n = 10;

        // 2.5 * 10 = (2 + 0.5) * 10
        // further we can say 2*10 + 0.5 * 10
        // so we can also do this  (10<<2) + (10>>1)

        System.out.println((n<<1) + (n>>1));
    }
}

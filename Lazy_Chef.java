import java.util.Scanner;

/**
 * Lazy_Chef
 */
public class Lazy_Chef {

    public static void main(String[] args) {
        int t;
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();
        while (t-- > 0) {
            int m, x, d, k, l;
            x = sc.nextInt();
            m = sc.nextInt();
            d = sc.nextInt();
            k = m * x;
            l = x + d;
            if (k < l) {
                System.out.println(k);
            } else if (l < k) {
                System.out.println(l);
            } else {
                System.out.println(k);
            }

        }
        sc.close();
    }

}
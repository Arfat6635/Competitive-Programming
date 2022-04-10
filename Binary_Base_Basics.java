import java.util.Scanner;

/**
 * Binary_Base_Basics
 */
public class Binary_Base_Basics {

    public static void main(String[] args) {
        int t;
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();
        while (t-- > 0) {
            int k, n, c = 0;
            String s;
            n = sc.nextInt();
            k = sc.nextInt();
            s = sc.next();
            for (int i = 0, j = n - 1; i < j; i++, j--) {
                if (s.charAt(i) != s.charAt(j)) {
                    c += 1;
                }
            }

            if (c <= k) {
                if (n % 2 == 1) {
                    System.out.println("YES");
                } else if ((k - c) % 2 == 0) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }

            } else {
                System.out.println("NO");
            }

        }
        sc.close();
    }
}
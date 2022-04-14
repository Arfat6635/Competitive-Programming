import java.util.Scanner;

/**
 * Dazzling_GCD_Pair
 */
public class Dazzling_GCD_Pair {

    public static void main(String[] args) {
        int t;
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();
        while (t-- > 0) {
            int a, b;
            a = sc.nextInt();
            b = sc.nextInt();
            if ((b - a) >= 2) {
                if (a % 2 == 0) {
                    System.out.println(a + " " + (a + 2)); // 2 - 10 
                } else {
                    if ((a + 3) <= b) {

                        if (a % 3 == 0) {
                            System.out.println(a + " " + (a + 3)); //15 20
                        } else {
                            System.out.println((a + 1) + " " + (a + 3)); //65  70
                        }
                    } else {
                        System.out.println(-1);
                    }
                }
            } else {
                System.out.println(-1);
            }
        }
        sc.close();
    }
}
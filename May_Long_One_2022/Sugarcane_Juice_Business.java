import java.util.Scanner;

/**
 * Sugarcane_Juice_Business
 */
public class Sugarcane_Juice_Business {

    public static void main(String[] args) {
        int t;
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();
        while (t-- > 0) {
            int n, coins = 50;
            Double s = 0.00, sm = 0.00, sr = 0.00, total = 0.00;
            n = sc.nextInt();
            total = Double.valueOf(coins * n);
            s = total * 0.20;
            sm = total * 0.20;
            sr = total * 0.30;
            System.out.println(Math.round(total - (s + sm + sr)));

        }
        sc.close();
    }
}
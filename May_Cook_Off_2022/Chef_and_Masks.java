import java.util.Scanner;

/**
 * Chef_and_Masks
 */
public class Chef_and_Masks {

    public static void main(String[] args) {
        int t;
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();
        while (t-- > 0) {
            int x, y, x_total, y_total;
            x = sc.nextInt();
            y = sc.nextInt();
            x_total = x * 100;
            y_total = y * 10;
            if (x_total > y_total) {
                System.out.println("Cloth");
            } else if (y_total > x_total) {
                System.out.println("Disposable");
            } else if (x_total == y_total) {
                System.out.println("Cloth");
            }

        }
        sc.close();
    }
}
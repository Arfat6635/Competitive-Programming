import java.util.Scanner;

/**
 * Alternate_Additions
 */
public class Alternate_Additions {

    public static void main(String[] args) {
        int t;
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();
        while (t-- > 0) {
            int x, y;
            Boolean a, b;
            x = sc.nextInt();
            y = sc.nextInt();
            a = x % 2 == 0 ? true : false;
            b = y % 2 == 0 ? true : false;

            if (a == false && b == true) {
                System.out.println("YES");
            } else if (a == true && b == true) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

        }
        sc.close();
    }
}
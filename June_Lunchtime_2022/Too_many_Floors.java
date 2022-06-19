import java.util.Scanner;

/**
 * Too_many_Floors
 */
public class Too_many_Floors {

    public static void main(String[] args) {
        int t;
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();
        while (t-- > 0) {
            int x, y;
            x = sc.nextInt();
            y = sc.nextInt();
            if (((x >= 1 && x <= 10) && (y >= 91 && x <= 100)) || ((y >= 1 && y <= 10) && (x >= 91 && x <= 100))) {
                System.out.println(9);
            } else {
                if (x % 10 != 0 && y % 10 != 0) {
                    x = x + (10 - (x % 10));
                    y = y + (10 - (y % 10));

                    System.out.println(Math.abs((x / 10) - (y / 10)));

                } else if (x % 10 != 0 && y % 10 == 0) {
                    x = x + (10 - (x % 10));

                    System.out.println(Math.abs((x / 10) - (y / 10)));
                } else if (x % 10 == 0 && y % 10 != 0) {
                    y = y + (10 - (y % 10));

                    System.out.println(Math.abs((x / 10) - (y / 10)));
                } else if (x % 10 == 0 && y % 10 == 0) {
                    System.out.println(Math.abs(Math.abs((x / 10) - (y / 10))));

                }

            }

        }
        sc.close();
    }
}
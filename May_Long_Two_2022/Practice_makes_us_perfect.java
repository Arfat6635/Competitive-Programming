import java.util.Arrays;
import java.util.Scanner;

/**
 * Practice_makes_us_perfect
 */
public class Practice_makes_us_perfect {

    public static void main(String[] args) {
        int arr[] = new int[4];
        int c = 0;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            arr[i] = sc.nextInt();

            if (arr[i] >= 10) {
                c += 1;
            }

        }
        System.out.println(c);

        sc.close();
    }
}
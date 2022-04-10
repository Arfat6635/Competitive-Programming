import java.util.Arrays;
import java.util.Scanner;

/**
 * Maximize_the_Minimum
 */
public class Maximize_the_Minimum {

    public static void main(String[] args) {
        int t;
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();
        while (t-- > 0) {
            int n, k;
            n = sc.nextInt();
            k = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            Arrays.sort(arr);
            k = Math.min(k, (n - 1));

            System.out.println(arr[k]);

        }
        sc.close();
    }
}
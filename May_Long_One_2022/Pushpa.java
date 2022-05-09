import java.util.Arrays;
import java.util.Scanner;

/**
 * Pushpa
 */
public class Pushpa {

    public static void main(String[] args) {
        int t;
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();
        while (t-- > 0) {
            int n, max = 0, c = 0;
            n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            Arrays.sort(arr);

            if (n == 1) {
                System.out.println(arr[0]);
            } else {

                for (int i = n - 1; i >= 1; i--) {
                    if (arr[i] == arr[i - 1]) {
                        c += 1;
                    } else {
                        if (max < (arr[i] + c)) {
                            max = arr[i] + c;
                        }
                        c = 0;
                    }
                }

                System.out.println(max);

            }

        }
        sc.close();
    }
}
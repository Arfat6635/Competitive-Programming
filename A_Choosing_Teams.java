import java.util.Scanner;

/**
 * A_Choosing_Teams
 */
public class A_Choosing_Teams {

    public static void main(String[] args) {
        int n, k, count = 0;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            arr[i] = arr[i] + k;
        }

        for (int i = 0; i < n; i++) {
            if (arr[i] <= 5) {
                count += 1;
            }
        }

        System.out.print(count / 3);

    }
}
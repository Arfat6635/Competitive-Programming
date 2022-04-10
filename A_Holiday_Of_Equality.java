import java.util.Scanner;

/**
 * A_Holiday_Of_Equality
 */
public class A_Holiday_Of_Equality {

    public static void main(String[] args) {
        int n, rubles = 0;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        int max = arr[0];

        for (int i = 1; i < n; i++) {
            rubles += max - arr[i];
        }

        System.out.print(rubles);

    }
}
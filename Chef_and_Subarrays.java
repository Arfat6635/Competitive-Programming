import java.util.Scanner;

/**
 * Chef_and_Subarrays
 */
public class Chef_and_Subarrays {

    public static void main(String[] args) {
        int t;
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();
        while (t-- > 0) {
            int n, c = 0;
            n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {

                arr[i] = sc.nextInt();


            }

            for (int i = 0; i < n; i++) {
                int sum = 0, prod = 1;
                for (int j = i; j < n; j++) {
                    sum = sum + arr[j];
                    prod = prod * arr[j];
                    if (sum == prod) {
                        c += 1;
                    }
                }

            }
            System.out.println(c);
        }
        sc.close();
    }
}
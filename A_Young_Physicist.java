import java.util.Scanner;

/**
 * A_Young_Physicist
 */
public class A_Young_Physicist {

    public static void main(String[] args) {
        int t;
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();
        int x = 0;
        int arr[][] = new int[t][3];
        int sum[] = new int[3];
        for (int i = 0; i < t; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < t; j++) {
                x += arr[j][i];
            }
            sum[i] = x;
        }

        if (sum[0] == 0 && sum[1] == 0 && sum[2] == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        sc.close();
    }
}
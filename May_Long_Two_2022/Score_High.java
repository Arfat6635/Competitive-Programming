import java.util.Scanner;

/**
 * Score_High
 */
public class Score_High {

    public static void main(String[] args) {
        int t;
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();
        while (t-- > 0) {
            int n = 0, max = 0;
            n = sc.nextInt();
            int arr[] = new int[4];
            for (int i = 0; i < 4; i++) {
                arr[i] = sc.nextInt();
                if (arr[i] > max) {
                    max = arr[i];
                }
            }

            System.out.println(max);

        }
        sc.close();
    }
}
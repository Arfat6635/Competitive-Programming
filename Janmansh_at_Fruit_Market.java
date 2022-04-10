import java.util.Scanner;

/**
 * Janmansh_at_Fruit_Market
 */
public class Janmansh_at_Fruit_Market {

    public static void main(String[] args) {
        int t;
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();
        while (t-- > 0) {
            int c, x, a, b;
            x = sc.nextInt();
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();
            int arr[] = new int[3];
            arr[0] = a;
            arr[1] = b;
            arr[2] = c;

            for (int i = 1; i < 3; i++) {

                int index = i;
                int key = arr[index];

                while (index > 0 && arr[index - 1] > key) {
                    arr[index] = arr[index - 1];
                    index -= 1;
                }
                arr[index] = key;
            }

            if (x == 2) {
                System.out.println(arr[0] + arr[1]);
            } else {
                c = arr[0] + arr[1];
                for (int i = 0; i < (x - 2); i++) {
                    c += arr[0];
                }

                System.out.println(c);
            }

        }
        sc.close();
    }
}
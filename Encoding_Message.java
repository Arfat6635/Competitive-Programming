import java.util.Scanner;

/**
 * Encoding_Message
 */
public class Encoding_Message {

    public static void main(String[] args) {
        int t;
        Scanner scanner = new Scanner(System.in);
        t = scanner.nextInt();
        while (t-- > 0) {
            int n;
            String word;
            char temp;
            n = scanner.nextInt();
            word = scanner.next();
            char arr[] = new char[n];

            for (int k = 0; k < n; k++) {
                arr[k] = word.charAt(k);
            }
            for (int i = 0; i < n - 1; i += 2) {
                temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
            for (int m = 0; m < n; m++) {
                int val=('z' + 'a')- arr[m];
                char ans=(char)val;
                System.out.print(ans);
            }
            System.out.println("");

        }
        scanner.close();
    }
}
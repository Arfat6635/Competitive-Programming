import java.util.Scanner;

/**
 * Non_Adjacent_Flips
 */
public class Non_Adjacent_Flips {

    public static void main(String[] args) {
        int t;
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();
        while (t-- > 0) {
            int x;
            x = sc.nextInt();
            String s;
            s = sc.next();
            char arr[] = s.toCharArray();
            int c = 0;
            for (int i = 0; i < s.length(); i++) {
                if (i % 2 == 0 && arr[i] == '1') {
                    c += 1;
                }
                i += 1;
            }
            System.out.println(c);
        }
        sc.close();
    }
}
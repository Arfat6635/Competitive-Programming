import java.util.Scanner;

/**
 * Chef_and_his_Students
 */
public class Chef_and_his_Students {

    public static void main(String[] args) {
        int t;
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();
        while (t-- > 0) {
            int c = 0;
            String str;
            str = sc.next();

            for (int i = 0; i < str.length() - 1; i += 1) {
                if (str.charAt(i) == '<' && str.charAt(i + 1) == '>') {
                    c += 1;
                }
            }
            System.out.println(c);

        }
        sc.close();
    }
}
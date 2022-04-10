import java.util.Scanner;

/**
 * Wordle
 */
public class Wordle {

    public static void main(String[] args) {
        int t;
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();
        while (t-- > 0) {
            String s, x, ans = "";
            s = sc.next();
            x = sc.next();
         
            for (int i = 0; i < 5; i++) {
                if (s.charAt(i) != x.charAt(i)) {
                    ans = ans.concat("B");
                } else if (s.charAt(i) == x.charAt(i)) {
                    ans = ans.concat("G");
                }
            }

            System.out.println(ans);

        }
        sc.close();
    }
}
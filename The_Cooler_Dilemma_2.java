import java.util.Scanner;

/**
 * The_Cooler_Dilemma_2
 */
public class The_Cooler_Dilemma_2 {

    public static void main(String[] args) {
        int t;
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();
        while (t-- > 0) {
            int x, y, ans;
            x = sc.nextInt();
            y = sc.nextInt();
            ans = Math.abs(y / x);

            if (y%x!=0) {
                System.out.println(ans);
            }else{
                System.out.println(ans-1);
            }

        }
        sc.close();
    }
}
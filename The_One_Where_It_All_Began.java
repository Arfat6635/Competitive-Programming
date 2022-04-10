import java.util.Scanner;

/**
 * The_One_Where_It_All_Began
 */
public class The_One_Where_It_All_Began {

    public static void main(String[] args) {
        int t;
        Scanner sc= new Scanner(System.in);
        t=sc.nextInt();
        while (t-->0) {
            int cookie;
            cookie=sc.nextInt();
            if (cookie>=21) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
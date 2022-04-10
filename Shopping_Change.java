import java.util.Scanner;

/**
 * Shopping_Change
 */
public class Shopping_Change {

    public static void main(String[] args) {
        int t;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        while (t-->0) {
            int x;
            x=sc.nextInt();
            System.out.println(100-x);
        }
        sc.close();
    }
}
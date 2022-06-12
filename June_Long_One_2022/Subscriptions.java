import java.util.Scanner;

/**
 * Subscriptions
 */
public class Subscriptions {

    public static void main(String[] args) {
        int t;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        while (t-->0) {
            int x,y;
            x=sc.nextInt();
            y=sc.nextInt();
            if (x<=6) {
                System.out.println(y);
            }
            else if (x%6==0) {
                System.out.println((x/6)*y);
            }else{
                System.out.println(((x/6)+1)*y);
            }
        }
        sc.close();
    }
}
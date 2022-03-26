import java.util.Scanner;

/**
 * Chef_and_Chocolates
 */
public class Chef_and_Chocolates {

    public static void main(String[] args) {
        int t;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        while (t-->0) {
            int c,x,y;
            c=sc.nextInt();
            x=sc.nextInt();
            y=sc.nextInt();

            System.out.println(Math.abs(x-c)*y);

        }
        sc.close();
    }
}
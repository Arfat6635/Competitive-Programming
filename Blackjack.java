import java.util.Scanner;

/**
 * Blackjack
 */
public class Blackjack {

    public static void main(String[] args) {
        int t;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        while (t-->0) {
            int a,b,c;
            a=sc.nextInt();
            b=sc.nextInt();
            c=21-(a+b);
            if (c>=1 && c<=10) {
                System.out.println(c);
            }
            else{
                System.out.println(-1);
            }
        }
        sc.close();
    }
}
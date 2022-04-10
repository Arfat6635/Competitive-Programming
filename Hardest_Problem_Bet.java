import java.util.Scanner;

/**
 * Hardest_Problem_Bet
 */
public class Hardest_Problem_Bet {

    public static void main(String[] args) {
        int t;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        while (t-->0) {
            int a,b,c;
            a=sc.nextInt();
            b=sc.nextInt();
            c=sc.nextInt();

            if (b<a && b<c) {
                System.out.println("Bob");
            }
            else if (c<a && c<b) {
                System.out.println("Alice");
            }
            else{
                System.out.println("Draw");
            }


        }
        sc.close();
    }
}
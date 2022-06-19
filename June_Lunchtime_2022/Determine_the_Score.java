import java.util.Scanner;

/**
 * Determine_the_Score
 */
public class Determine_the_Score {

    public static void main(String[] args) {
        int t;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        while (t-->0) {
            int x,n;
            x=sc.nextInt();
            n=sc.nextInt();
            System.out.println((x/10)*n);
        }
        sc.close();
    }
}
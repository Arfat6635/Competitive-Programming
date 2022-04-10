import java.util.Scanner;

/**
 * Too_many_items
 */
public class Too_many_items {

    public static void main(String[] args) {
        int t;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        while (t-->0) {
            double n=0.0;
            double num=0.0;
            n=sc.nextDouble();
            num=Math.ceil(n/10);
            System.out.println((int)num);
        }
        sc.close();
    }
}
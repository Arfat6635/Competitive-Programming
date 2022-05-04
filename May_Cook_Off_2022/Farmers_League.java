import java.util.Scanner;

/**
 * Farmers_League
 */
public class Farmers_League {

    public static void main(String[] args) {
        int t;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        while (t-->0) {
            int n, first, second;
            n=sc.nextInt();
            first=(n-1)*3;
            second=((n-1)/2)*3;
            System.out.println(first-second);
        }
        sc.close();
    }
}
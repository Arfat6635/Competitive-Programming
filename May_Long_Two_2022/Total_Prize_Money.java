import java.util.Scanner;

/**
 * Total_Prize_Money
 */
public class Total_Prize_Money {

    public static void main(String[] args) {
        int t;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        while (t-->0) {
            int x,y;
            x=sc.nextInt();
            y=sc.nextInt();
            System.out.println((x*10)+(y*90));
        }
        sc.close();
    }
}
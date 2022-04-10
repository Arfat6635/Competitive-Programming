import java.util.Scanner;

/**
 * Get_Lowest_Free
 */
public class Get_Lowest_Free {

    public static void main(String[] args) {
        int t;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        while (t-->0) {
            int a,b,c;
            a=sc.nextInt();
            b=sc.nextInt();
            c=sc.nextInt();
            if (a<b && a<c) {
                System.out.println(b+c);
            }
            else if (b<c) {
                System.out.println(a+c);
            }
            else{
                System.out.println(a+b);
            }
        }
        sc.close();
    }
}
import java.util.Scanner;

/**
 * Finding_Shoes
 */
public class Finding_Shoes {

    public static void main(String[] args) {
        int t;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        while (t-->0) {
            int m,n;
            n=sc.nextInt();
            m=sc.nextInt();
            if (m==0) {
                System.out.println(n*2);
            }else if (m>=n) {
                System.out.println(n);
            }else if (m<n) {
                System.out.println(((n-m)*2)+m);
            }
        }
        sc.close();
    }
}
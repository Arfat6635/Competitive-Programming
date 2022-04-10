import java.util.Scanner;

/**
 * The_One_with_Russ
 */
public class The_One_with_Russ {

    public static void main(String[] args) {
        int t;
        Scanner sc= new Scanner(System.in);
        t=sc.nextInt();
        while (t-->0) {
            int n=0, x=0, k=0, ans=0 , c=0, flag=0;
            n=sc.nextInt();
            x=sc.nextInt();
            k=sc.nextInt();
            int a[]=new int[n];
            int b[]=new int[n];
            for (int i = 0; i < n; i++) {
                a[i]=sc.nextInt();
            }
            for (int i = 0; i < n; i++) {
                b[i]=sc.nextInt();
            }

            for (int i = 0; i < n; i++) {
                 ans= Math.abs(a[i]-b[i]);
                 if ( ans <=k) {
                     c+=1;
                 }

                 if (c==x) {
                     flag=1;
                     break;
                 }
            }

            if (flag==1) {
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
import java.util.Scanner;

/**
 * Careless_Chef
 */
public class Careless_Chef {

    public static void main(String[] args) {
        int t;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        while (t-->0) {
            int n=0,c=0;
            n=sc.nextInt();
            int a[]=new int[n];
            for (int i = 0; i < n; i++) {
                a[i]=sc.nextInt();    
                // if (a[i]%n==0) {
                //     c=1;
                // }            
            }
            
            // if (c==1) {
            //     System.out.println("YES");
            // }
            // else{
            //     System.out.println("NO");
            // }

        }
        sc.close();
    }

}
import java.util.Scanner;

/**
 * B_Two_Arrays_And_Swaps
 */
public class B_Two_Arrays_And_Swaps {

    public static void main(String[] args) {
        int t, sum=0;
        Scanner sc = new Scanner(System.in);
        t=sc.nextInt();

        while (t>0) {
            
            int n,k;
            n=sc.nextInt();
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
                for (int j = 0; j < n-i-1; j++) {
                    
                    if (a[j]>a[j+1]) {
                        int temp=a[j];
                        a[j]=a[j+1];
                        a[j+1]=temp;
                    }
                }
            }


            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n-i-1; j++) {
                    
                    if (b[j]<b[j+1]) {
                        int temp=b[j];
                        b[j]=b[j+1];
                        b[j+1]=temp;
                    }
                }
            }

            for (int i = 0; i < k; i++) {
                
                if (b[i]>a[i]) {
                    a[i]=b[i];
                }
            }

            for (int i = 0; i < n; i++) {
                
             sum+= a[i];
            }

            System.out.println(sum);
            sum=0;
            t-=1;
        }
    }
}
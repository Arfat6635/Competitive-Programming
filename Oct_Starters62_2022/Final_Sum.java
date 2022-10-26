import java.util.Scanner;

/**
 * Final_Sum
 */
public class Final_Sum {

    public static void main(String[] args) {
        int t;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        while (t-->0) {
            int n,q;
            n=sc.nextInt();
            q=sc.nextInt();
            int arr[]=new int[n];
            for (int i = 0; i < n; i++) {
                arr[i]=sc.nextInt();
            }
            while (q-->0) {
             int a,b;
             a=sc.nextInt();
             b=sc.nextInt();
             a-=1;
             int flag=1;
             for (int i = a; i < b; i++) {
                if (flag==1) {
                    arr[i]=arr[i]+1;
                    flag=0;
                }else if (flag==0) {
                    arr[i]=arr[i]-1;
                    flag=1;
                }
             }               
            }
            int z=0;
            for (int k = 0; k < n; k++) {
                
                    z+=arr[k];
                
            }
            System.out.println(z);
        }
    }
}
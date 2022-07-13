import java.util.Arrays;
import java.util.Scanner;

/**
 * K-MEX
 */
public class K_MEX {

    public static void main(String[] args) {
        int t;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        while (t-->0) {
           int n,m,k;
           n=sc.nextInt();
           m=sc.nextInt();
           k=sc.nextInt();
           int arr[]=new int[n+1];
           for(int j=0;j<n;j++){
            arr[sc.nextInt()]++;
        }

        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }

        }
        sc.close();
    }
}
import java.util.Scanner;

/**
 * Adjacent_Sum_Parity
 */
public class Adjacent_Sum_Parity {

    public static void main(String[] args) {
        int t;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        while (t-->0) {
            int n, sum=0;
            n=sc.nextInt();
            int arr[]=new int[n];
            for (int i = 0; i < n; i++) {

                arr[i]=sc.nextInt();
                sum+=arr[i];
                
            }
           if (sum%2==0) {
            System.out.println("YES");
           }else{
            System.out.println("NO");
           }


        }
        sc.close();
    }
}
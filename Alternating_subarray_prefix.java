import java.util.Scanner;

/**
 * Alternating_subarray_prefix
 */
public class Alternating_subarray_prefix {

    public static void main(String[] args) {
        int t=0;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        while (t-->0) {
            int x=0;
            x=sc.nextInt();
            int arr[]=new int[x];
            int ans[]=new int[x];
            for (int i = 0; i < x; i++) {
                arr[i]=sc.nextInt();
                ans[i]=0;
            }


            ans[x-1]=1;
            for (int j = x-2; j>=0; j--) {
                if ((arr[j]<0 && arr[j+1]>0)||(arr[j]>0 && arr[j+1]<0)) {
                    ans[j]=ans[j+1]+1;
                }
                else{
                    ans[j]=1;
                }
            }

            for (int k = 0; k < x; k++) {
                System.out.print(ans[k]+" ");
            }
            System.out.println();
        }
        sc.close();

    }
}
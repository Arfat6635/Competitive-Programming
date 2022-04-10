import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * The_One_On_The_Last_Night
 */
public class The_One_On_The_Last_Night {

    public static void main(String[] args) {
        int t;
        Scanner sc= new Scanner(System.in);
        t=sc.nextInt();
        while (t-->0) {
            int n=0, k=0;
            n=sc.nextInt();
            k=sc.nextInt();
            int s=0, temp=n;

            while (temp!=0) {
                temp=temp/10;
                s+=1;
            }
            int arr[]=new int[s];

            for (int i = 0; i < s; i++) {
                arr[i]=n%10;
                n=n/10;
            }
            

            for (int i = 0; i < k; i++) {
                Arrays.sort(arr);
                if (arr[0]!=9) {
                    arr[0]+=1;
                }
            }
            int ans=1;
            for (int i = 0; i < s; i++) {
                ans*=arr[i];
            }
            System.out.println(ans);
        }       
    }
}
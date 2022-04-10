import java.util.Arrays;
import java.util.Scanner;

/**
 * B_Honest_Coach
 */
public class B_Honest_Coach {

    public static void main(String[] args) {
        int t;
        Scanner sc= new Scanner(System.in);
        t=sc.nextInt();
        while (t-->0) {
            int n;
            n=sc.nextInt();
            int arr[]=new int[n];
            for (int i = 0; i < n; i++) {
                arr[i]=sc.nextInt();
                
            }

            Arrays.sort(arr);
            int min=arr[n-1];
            for (int i = 0; i < n-1; i++) {
                if (arr[i+1]-arr[i]<min) {
                    min=arr[i+1]-arr[i];
                }
            }

            System.out.println(min);
        }
    }
}
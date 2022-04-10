import java.util.Arrays;
import java.util.Scanner;

/**
 * List_of_Lists
 */
public class List_of_Lists {

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
            if (arr.length<=1) {
                System.out.println("0");
            }
            else if (arr[0]==arr[1]) {
                System.out.println(arr.length-1);
            }
            else{
                System.out.println("-1");
            }
        }
        sc.close();
    }
}
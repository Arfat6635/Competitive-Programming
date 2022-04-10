import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 * Remove_Adjacent
 */
public class Remove_Adjacent {

    public static void main(String[] args) {
        int t;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        while (t-->0) {
            int n=0,op=0;;
            n=sc.nextInt();
            int arr[]=new int[n];
            


            for (int i = 0; i < n; i++) {
                arr[i]=sc.nextInt();
            }

            int max = Arrays.stream(arr).max().getAsInt();

            if (arr.length==2) {
                if (arr[0]==arr[1]) {
                    System.out.println(0);
                }
                else{
                    System.out.println(1);
                }
            }
            else if (arr.length>2) {
                for (int j = 0; j < arr.length-1 ; j++) {
                    if (arr[j]+arr[j+1]==max) {
                        op+=1;
                    }
                }
                System.out.println(op);
            }

           

        }
        sc.close();
    }
}
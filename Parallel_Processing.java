import java.util.Scanner;

/**
 * Parallel_Processing
 */
public class Parallel_Processing {

    public static void main(String[] args) {
        int t;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        while (t-->0) {
            int n,index=0,value=0,a=0,b=0;
            n=sc.nextInt();
            int arr[]=new int[n];
            for (int i = 0; i < n; i++) {
                arr[i]=sc.nextInt();
            }
            for (int i = 1; i < n; i++) {
                index=i;
                value=arr[i];

                while (index>0&&arr[index-1]>value) {
                    arr[index]=arr[index-1];
                    index-=1;
                }
                arr[index]=value;
            }

            if (n==1) {
                System.out.println(arr[0]);
            }
            else if (n%2==1) {
                for (int i = 0; i < ((n/2)+1); i++) {
                    a+=arr[i];
                }
                for (int i = ((n/2)); i < n; i++) {
                    b+=arr[i];
                }
                if (a>b) {
                    System.out.println(a);
                }else{
                    System.out.println(b);
                }
               
            }
            else{
                for (int i = 0; i < (n/2); i++) {
                    a+=arr[i];
                }
                for (int i = ((n/2)); i < n; i++) {
                    b+=arr[i];
                }
                if (a>b) {
                    System.out.println(a);
                }else{
                    System.out.println(b);
                }
            }


        }
        sc.close();
    }
}
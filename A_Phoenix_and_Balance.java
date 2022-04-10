import java.util.Scanner;

/**
 * A_Phoenix_and_Balance
 */
public class A_Phoenix_and_Balance {

    public static void main(String[] args) {
        int t;
        Scanner sc=new Scanner(System.in);

        t=sc.nextInt();

        while (t-->0) {
            int n, x=2, temp=0,a=0, b=0;
            n=sc.nextInt();
            int arr[]=new int[n];

            for (int i = 0; i < n; i++) {
                arr[i]=x;
                x+=x;
            }

            if (n==2) {

                System.out.println(arr[1]-arr[0]);
                
            }
            else{

            temp=arr[(n/2)-1];
            arr[(n/2)-1]=arr[n-1];
            arr[n-1]=temp;


            for (int i = 0; i < n/2; i++) {
                a+=arr[i];
            }


            for (int i = n/2; i < n; i++) {
                b+=arr[i];
            }

            System.out.println(a-b);

        }


        }

    }
}
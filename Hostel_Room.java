import java.util.Scanner;

/**
 * Hostel_Room
 */
public class Hostel_Room {

    public static void main(String[] args) {
        int t;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        while (t-->0) {
            int n,x,max=0;
            n=sc.nextInt();
            x=sc.nextInt();
            max=x;
            int a[]=new int[n];
            int b[]=new int[n];
            for (int i = 0; i <n; i++) {
                a[i]=sc.nextInt();
                x+=a[i];
                b[i]=x;

                if (b[i]>max) {
                    max=b[i];
                }

            }
            System.out.println(max);

        }
        sc.close();
    }
}
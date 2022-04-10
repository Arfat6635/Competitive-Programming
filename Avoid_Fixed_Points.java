import java.util.Scanner;

/**
 * Avoid_Fixed_Points
 */
public class Avoid_Fixed_Points {

    public static void main(String[] args) {
        int t;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        while (t-->0) {
            int n,x=1,c=0;
            n=sc.nextInt();
            int arr[]=new int[n];
            for (int i = 0; i < n; i++) {
                arr[i]=sc.nextInt();
            }
            for (int j = 0; j < n; j++) {
                if (arr[j]==x) {
                    c+=1;
                    x+=1;
                }
                x+=1;
            }

            System.out.println(c);
        }
        sc.close();
    }
}
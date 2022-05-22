import java.util.Scanner;

/**
 * Degree_of_Polynomial
 */
public class Degree_of_Polynomial {

    public static void main(String[] args) {
        int t;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        while (t-->0) {
            int n, ans=0;
            n=sc.nextInt();
            int arr[]=new int[n];
            for (int i = 0; i < n; i++) {
                arr[i]=sc.nextInt();
            }
            ans=n-1;

            for (int i = (n-1); i >0; i--) {
                if (arr[i]!=0) {
                    break;
                }else if (arr[i]==0) {
                    ans-=1;
                }
            }

            System.out.println(ans);

        }
        sc.close();
    }
}
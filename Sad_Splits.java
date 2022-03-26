import java.util.Scanner;

/**
 * Sad_Splits
 */
public class Sad_Splits {

    public static void main(String[] args) {
        int t;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        while (t-->0) {
            int n, last_digit=0, flag=0;
            n=sc.nextInt();
            last_digit=(n%10)%2;
            n=n/10;
            while (n>0) {
                if ((n%10)%2==last_digit) {
                    flag=1;
                    break;
                }
                n=n/10;
            }

            if (flag==1) {
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }

        }
        sc.close();
    }
}
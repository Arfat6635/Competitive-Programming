import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;

/**
 * Digit_Sum_Parities
 */
public class Digit_Sum_Parities {

    public static int digitSum(long x) {
        long temp=x;
        int ans=0;
        while (temp>0) {
            ans+=temp%10;
            temp=temp/10;
        }
        return ans%2;
    }
    public static void main(String[] args) {
        int t;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        while (t-->0) {
            long f;
            f=sc.nextLong();

            if (digitSum(f)!=digitSum(f+1)) {
                System.out.println(f+1);
            }else 
            {
                System.out.println(f+2);
            }

        }
        sc.close();
    }
}
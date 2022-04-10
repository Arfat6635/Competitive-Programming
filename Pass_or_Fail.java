import java.util.Scanner;

/**
 * Pass_or_Fail
 */
public class Pass_or_Fail {

    public static void main(String[] args) {
        int t;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        while (t-->0) {
            int n,x,p,result=0;
            n=sc.nextInt();
            x=sc.nextInt();
            p=sc.nextInt();

            result=(x*3)-(n-x);

            if (result>=p) {
                System.out.println("PASS");
            }
            else if (result<p) {
                System.out.println("FAIL");
            }

        }
    }
}
import java.util.Scanner;

/**
 * Course_Registration
 */
public class Course_Registration {

    public static void main(String[] args) {
        int t;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        while (t-->0) {
            int n,m,k;
            n=sc.nextInt();
            m=sc.nextInt();
            k=sc.nextInt();

            if ((m-k)>=n) {
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }
        sc.close();
    }
}
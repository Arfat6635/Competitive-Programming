
import java.util.Scanner;

/**
 * A_Deletions_of_Two_Adjacent_Letters
 */
public class A_Deletions_of_Two_Adjacent_Letters {

    public static void main(String[] args) {
        int t;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        while (t-->0) {
            String x, y;
            x=sc.next();
            y=sc.next();
            Boolean flag=false;

            for (int i = 0; i < x.length(); i++) {
                if (x.charAt(i) == y.charAt(0) && i%2==0) {
                    flag=true;
                }
            }
            if (flag) {
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
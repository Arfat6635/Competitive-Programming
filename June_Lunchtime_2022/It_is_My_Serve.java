import java.util.Scanner;

/**
 * It_is_My_Serve
 */
public class It_is_My_Serve {

    public static void main(String[] args) {
        int t;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        while (t-->0) {
            int p,q,z=0;
            p=sc.nextInt();
            q=sc.nextInt();
            if (p==0 && q==0) {
                System.out.println("Alice");
            }else{
                z=(p+q)/2;
                if (z%2==0) {
                    System.out.println("Alice");
                }else{
                    System.out.println("Bob");
                }
            }
        }
        sc.close();
    }
}
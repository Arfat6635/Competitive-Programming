import java.util.Scanner;

/**
 * Valentine_is_Coming
 */
public class Valentine_is_Coming {

    public static void main(String[] args) {
        int t;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        while (t-->0) {
            int x,y;
            x=sc.nextInt();
            y=sc.nextInt();
            System.out.println(x/y);
        }
        sc.close();
    }
}
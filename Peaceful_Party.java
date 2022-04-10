import java.util.Scanner;

/**
 * Peaceful_Party
 */
public class Peaceful_Party {

    public static void main(String[] args) {
        int t;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        while (t-->0) {
            int a,b,c;
            a=sc.nextInt();
            b=sc.nextInt();
            c=sc.nextInt();

            if (b>(a+c)) {
                System.out.println(b);
            }else if ((a+c)>b) {
                System.out.println(a+c);
            }

        }
        sc.close();
    }
}
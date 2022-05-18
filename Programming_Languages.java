import java.util.Scanner;

/**
 * Programming_Languages
 */
public class Programming_Languages {

    public static void main(String[] args) {
        int t;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        while (t-->0) {
            int a,b,a1,b1,a2,b2;
            a=sc.nextInt();
            b=sc.nextInt();
            a1=sc.nextInt();
            b1=sc.nextInt();
            a2=sc.nextInt();
            b2=sc.nextInt();

            if ((a==a1 && b==b1)||(a==b1 && b==a1)) {
                System.out.println(1);
            }else if (a==a2 && b==b2||(a==b2 && b==a2)) {
                System.out.println(2);
            }else{
                System.out.println(0);
            }

        }
        sc.close();
    }
}
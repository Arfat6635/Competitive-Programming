import java.util.Scanner;

/**
 * Best_of_Two
 */
public class Best_of_Two {

    public static void main(String[] args) {
        int t;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        while (t-->0) {
            int x,y;
            x=sc.nextInt();
            y=sc.nextInt();
            if (x==y) {
                System.out.println(x);
            }else if (x>y) {
                System.out.println(x);
            }else{
                System.out.println(y);
            }
        }
        sc.close();
    }
}
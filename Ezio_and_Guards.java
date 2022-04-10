import java.util.Scanner;

/**
 * Ezio_and_Guards
 */
public class Ezio_and_Guards {

    public static void main(String[] args) {
        int t;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        while (t-->0) {
           int x,y;
           x=sc.nextInt();
           y=sc.nextInt();
           if (x>=y) {
               System.out.println("YES");
           } else{
               System.out.println("NO");
           }
        }
        sc.close();
    }
}
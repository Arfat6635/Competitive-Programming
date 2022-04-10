import java.util.Scanner;

/**
 * Volume_Control
 */
public class Volume_Control {

    public static void main(String[] args) {
        int t;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        while (t-->0) {
            int x,y;
            x=sc.nextInt();
            y=sc.nextInt();
            System.out.println(Math.abs(x-y));
        }
        sc.close();
    }
}
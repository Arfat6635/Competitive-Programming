import java.util.Scanner;

/**
 * Chairs_Requirement
 */
public class Chairs_Requirement {

    public static void main(String[] args) {
        int t;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        while (t-->0) {
            int x,y;
            x=sc.nextInt();
            y=sc.nextInt();
            System.out.println(y>x?0:(x-y));
        }
        sc.close();
    }
}
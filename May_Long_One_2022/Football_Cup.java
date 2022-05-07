import java.util.Scanner;

/**
 * Football_Cup
 */
public class Football_Cup {

    public static void main(String[] args) {
        int t;
        Scanner s=new Scanner(System.in);
        t=s.nextInt();
        while (t-->0) {
            int x,y;
            x=s.nextInt();
            y=s.nextInt();
            if (x>0 && y>0) {
                if (x==y) {
                    System.out.println("YES");
                }else{
                    System.out.println("NO");
                }
            }else{
                System.out.println("NO");
            }
        }
        s.close();
    }
}
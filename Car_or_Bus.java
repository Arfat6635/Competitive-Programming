import java.util.Scanner;

/**
 * Car_or_Bus
 */
public class Car_or_Bus {

    public static void main(String[] args) {
        int t;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        while (t-->0) {
            int x,y;
            x=sc.nextInt();
            y=sc.nextInt();
            if (x==y) {
                System.out.println("SAME");
            }
            else if (x<y) {
                System.out.println("BIKE");
            }
            else{
                System.out.println("CAR");
            }
        }
        sc.close();
    }
}
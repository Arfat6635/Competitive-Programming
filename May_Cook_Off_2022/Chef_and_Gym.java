import java.util.Scanner;

/**
 * Chef_and_Gym
 */
public class Chef_and_Gym {

    public static void main(String[] args) {
        int t;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        while (t-->0) {
            int x,y,z,o;
            x=sc.nextInt();
            y=sc.nextInt();
            z=sc.nextInt();
            o=x+y;
            if (o<=z) {
                System.out.println(2);
            }else if (x<=z) {
                System.out.println(1);
            }else{
                System.out.println(0);
            }

        }
        sc.close();
    }
}
import java.util.Scanner;

/**
 * The_Last_Levels
 */
public class The_Last_Levels {

    public static void main(String[] args) {
        int t;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        while (t-->0) {
            int x=0,y=0,z=0;
            x=sc.nextInt();
            y=sc.nextInt();
            z=sc.nextInt();
            if (x<=3) {
                System.out.println(x*y);
            }else if(x%3==0){
                System.out.println((x*y)+((x/3)-1)*z);
            }else{
                System.out.println((x*y)+((x/3))*z);
            }

        }
        sc.close();
    }
}

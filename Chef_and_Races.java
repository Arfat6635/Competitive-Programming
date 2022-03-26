import java.util.Scanner;

/**
 * Chef_and_Races
 */
public class Chef_and_Races {

    public static void main(String[] args) {
        int t;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        while (t-->0) {
            int x,y,a,b, c=2;
            x=sc.nextInt();
            y=sc.nextInt();
            a=sc.nextInt();
            b=sc.nextInt();
            
            if ((x==a || x ==b) &&(y==a || y==b) ) {
                c-=2;
            }else if ((x==a || x==b)&&(y!=a || y!=b)) {
                c-=1;
            }else if ((y==a || y==b)&&(x!=a || x!=b)) {
                c-=1;
            }
            System.out.println(c);

        }
        sc.close();
    }
}
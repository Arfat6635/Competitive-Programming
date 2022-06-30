import java.util.Scanner;

/**
 * Change_Row_and_Column_Both
 */
public class Change_Row_and_Column_Both {

    public static void main(String[] args) {
        int t;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        while (t-->0) {
            int x,y,m,n;
            x=sc.nextInt();
            y=sc.nextInt();
            m=sc.nextInt();
            n=sc.nextInt();
            if (x!=m && y !=n) {
                System.out.println(1);
            }else{
                System.out.println(2);
            }
        }
        sc.close();
    }
}
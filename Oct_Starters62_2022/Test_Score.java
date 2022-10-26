import java.util.Scanner;

/**
 * Test_Score
 */
public class Test_Score {

    public static void main(String[] args) {
        int t;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        while (t-->0) {
            int n,x,y;
            n=sc.nextInt();
            x=sc.nextInt();
            y=sc.nextInt();

            if (x<y) {
               if ((n*x>=y)&&(y%x==0)) {
                    System.out.println("YES");
                }else{
                    System.out.println("NO");
                }
            }
            else if (x==y) {
                System.out.println("YES");
            }else if (x>y) {
                if (y==0) {
                    System.out.println("YES");
                }else{
                    System.out.println("NO");
                }
            }
            
        }
    }
}
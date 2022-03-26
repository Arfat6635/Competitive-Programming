import java.util.Scanner;

/**
 * Buy_2_Get_1_Free
 */
public class Buy_2_Get_1_Free {

    public static void main(String[] args) {
        int t;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        while (t-->0) {
            int x,y,ans=0;
            x=sc.nextInt();
            y=sc.nextInt();
            while (x>0) {
                if (x%3==0) {
                    x-=1;
                    continue;
                }
                ans+=y;
                x-=1;
            }
            System.out.println(ans);
        }
        sc.close();
    }
}
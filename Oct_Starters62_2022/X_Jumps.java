import java.util.Scanner;

/**
 * X_Jumps
 */
public class X_Jumps {

    public static void main(String[] args) {
        int t;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        while (t-->0) {
            int x,y;
            x=sc.nextInt();
            y=sc.nextInt();
            int z= x/y;
            if(x>y){
                if (x%y==0) {
                    
                    System.out.println(x/y);
                }else if (x%y!=0) {
                    System.out.println(((x/y))+(x-((x/y)*y)));
                }
            }else if (y>x) {
                System.out.println(x);
            }else{
                System.out.println(1);
            }
        }
    }
}
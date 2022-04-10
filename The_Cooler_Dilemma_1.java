import java.util.Scanner;

/**
 * The_Cooler_Dilemma_1
 */
public class The_Cooler_Dilemma_1 {

    public static void main(String[] args) {
        int t;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        while (t-->0) {
           int x,y,m,n;
           x=sc.nextInt();
           y=sc.nextInt();
           m=sc.nextInt();
           
            n=x*m;
           if (n<y) {
             System.out.println("Yes");  
           }else{
               System.out.println("No");
           }
           
        }
        sc.close();
    }
}
import java.util.Scanner;

/**
 * Chef_and_Water_Bottles
 */
public class Chef_and_Water_Bottles {

    public static void main(String[] args) {
        int t;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        while (t-->0) {
            int n,x,k, c=0, temp=0;
            n=sc.nextInt();
            x=sc.nextInt();
            k=sc.nextInt();
            
            if ((k/x)>n) {
                System.out.println(n);
            }else{
                System.out.println(k/x);
            }
        }
        sc.close();
    }
}
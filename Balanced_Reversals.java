import java.util.Scanner;

/**
 * Balanced_Reversals
 */
public class Balanced_Reversals {

    public static void main(String[] args) {
        int t;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        while (t-->0) {
            String x;
            int zero=0,l=0, one=0;
            l=sc.nextInt();
            x=sc.next();
            for (int i = 0; i <l ; i++) {
                if (x.charAt(i)=='1') {
                    one+=1;
                }
                else{
                    zero+=1;
                }
                
            }

            for (int i = 0; i < zero; i++) {
                System.out.print(0);
            }
            for (int i = 0; i < one; i++) {
                System.out.print(1);
            }
            System.out.println();
        }
        sc.close();
    }
}
import java.util.Scanner;

/**
 * Zero_Ones_Equal_One_Zeros
 */
public class Zero_Ones_Equal_One_Zeros {

    public static void main(String[] args) {
        int t;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        while (t-->0) {
            int n;
            String s="1";
            n=sc.nextInt();
            for (int i = 0; i < n-2; i++) {
                    s+=String.valueOf(0);
            }
            System.out.println(s+"1");
            
        }
        sc.close();
    }
}
import java.util.Scanner;

/**
 * Good_Program
 */
public class Good_Program {

    public static void main(String[] args) {
        int t;
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();
        while (t-- > 0) {
            int n;
            n=sc.nextInt();
        
            if ((n/4)%2==0) {
                System.out.println("Good");
            }
            else{
                System.out.println("Not Good");
            }


        }
        sc.close();
    }
}
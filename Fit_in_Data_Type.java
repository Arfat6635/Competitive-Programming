import java.util.Scanner;

/**
 * Fit_in_Data_Type
 */
public class Fit_in_Data_Type {

    public static void main(String[] args) {
        int test_cases;
        Scanner scanner=new Scanner(System.in);
        test_cases=scanner.nextInt();
        while (test_cases-->0) {
            int z=0,m=0;
            z=scanner.nextInt();
            m=scanner.nextInt();

            if (m<=z) {
                System.out.println(m);
            }
            else{
                while (m>z) {
                    m=(m-z)-1;
                }
                System.out.println(m);
            }
        }
        scanner.close();
    }
}
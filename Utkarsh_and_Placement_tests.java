import java.util.Scanner;

/**
 * Utkarsh_and_Placement_tests
 */
public class Utkarsh_and_Placement_tests {

    public static void main(String[] args) {
        int t;
        Scanner sc= new Scanner(System.in);
        t=sc.nextInt();
        while (t-->0) {
            String first, second, third, x, y;
            first=sc.next();
            second=sc.next();
            third=sc.next();
            x=sc.next();
            y=sc.next();

            if (x.equals(first) || y.equals(first)) {
                System.out.println(first);
            }
            else{
                System.out.println(second);
            }
        }
        sc.close();
    }
}


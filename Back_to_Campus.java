import java.util.Scanner;

/**
 * Back_to_Campus
 */
public class Back_to_Campus {

    public static void main(String[] args) {
        int t = 0;
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();
        while (t > 0) {
           Double n = 0.00, k = 0.00;
            n = sc.nextDouble();
            k = sc.nextDouble();
            if (k == n) {
                System.out.println("1");
            } else {
                k=Math.ceil(n/k);
            }
            int z=k.intValue();
            System.out.println(z);
            t -= 1;
        }
        sc.close();
    }
}
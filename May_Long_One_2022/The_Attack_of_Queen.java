import java.util.Scanner;
/**
 * The_Attack_of_Queen
 */
public class The_Attack_of_Queen {

    public static void main(String[] args) {
        int t;
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();
        while (t-- > 0) {
            Long n, x, y, z, a, b, c, d;
            n = sc.nextLong();
            x = sc.nextLong();
            y = sc.nextLong();
            z = 2 * (n - 1); //3 2 2
            a = Math.min(x - 1, y - 1); //1 1 
            b = Math.min(x - 1, n - y); // 1, 1 
            c = Math.min(n - x, y - 1); // 1, 1 
            d = Math.min(n - x, n - y); //1, 1 
            z += a + b + c + d; //
            System.out.println(z);

        }
        sc.close();
    }
}
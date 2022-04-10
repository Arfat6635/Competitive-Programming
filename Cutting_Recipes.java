import java.util.Scanner;

/**
 * Cutting_Recipes
 */
//gcd refrence article
//https://www.khanacademy.org/computing/computer-science/cryptography/modarithmetic/a/the-euclidean-algorithm
// https://www.javatpoint.com/java-program-to-find-gcd-of-two-numbers
public class Cutting_Recipes {

    public static void main(String[] args) {
        int t;
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();
        while (t-- > 0) {
            int n, ans;
            n = sc.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {

                a[i] = sc.nextInt();
            }

            ans = gcd(a[0], a[1]);
            for (int i = 2; i < n; i++) {
                ans = gcd(ans, a[i]);
            }

            for (int i = 0; i < n; i++) {
                System.out.print(a[i] / ans + " ");
            }
            System.out.println("");
        }
        sc.close();
    }

    static int gcd(int a, int b) {
        
        if (a==0) {
            return b;
            
        }
        if (b==0) {
            return a;
            
        }
        if (a==b) {
            return a;
        }
        if (a>b) {
            return gcd(b,a%b);
        }
        else {
            return gcd(a, b%a);
        }      
    }

}
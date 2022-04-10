import java.util.Scanner;

/**
 * Tanu_and_Head_bob
 */
public class Tanu_and_Head_bob {

    public static void main(String[] args) {
        int t;
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();
        while (t > 0) {
            int n;
            String word = " ";
            n = sc.nextInt();
            word = sc.next();

            if (word.contains("I")) {
                System.out.println("INDIAN");
            } else if (word.contains("Y")) {
                System.out.println("NOT INDIAN");
            } else {
                System.out.println("NOT SURE");
            }

            t -= 1;
        }
        sc.close();
    }
}
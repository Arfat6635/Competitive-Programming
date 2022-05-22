import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Chef_and_Dolls
 */
public class Chef_and_Dolls {

    public static void main(String[] args) {
        int t;
        HashMap<Integer, Integer> hc = new HashMap<Integer, Integer>();
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();
        while (t-- > 0) {
            int n, x;
            n = sc.nextInt();

            while (n-- > 0) {

                x = sc.nextInt();

                if (hc.containsKey(x)) {
                    hc.put(x, hc.get(x) + 1);
                } else {
                    hc.put(x, 1);
                }
            }

            for (Map.Entry entry : hc.entrySet()) {
                int m = (Integer) (entry.getValue());
                if (m % 2 != 0) {
                    System.out.println(entry.getKey());
                }
            }
        }

        sc.close();
    }
}
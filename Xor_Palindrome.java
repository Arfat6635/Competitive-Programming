import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Xor_Palindrome
 */
public class Xor_Palindrome {

    public static void main(String[] args) {

        int t;
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();
        while (t-- > 0) {
            Set<Integer> s = new HashSet<Integer>();
            int n = 0, first = 0, last = 0, isPalindrome = 0;
            String str;
            n = sc.nextInt();
            str = sc.next();
            first = 0;
            last = n - 1;
            for (int i = 0; i < n; i++) {
                if (first == last) {
                    continue;
                }
                s.add(Character.getNumericValue(str.charAt(first)) ^ Character.getNumericValue(str.charAt(last)));
                first += 1;
                last -= 1;
            }

            if (s.size() <= 1) {
                isPalindrome = 1;
            }

            if ((n % 2 != 0) && (isPalindrome == 0)) {
                System.out.println("YES");
            } else if (n % 2 == 0 && isPalindrome == 0) {
                int one = 0, zero = 0;
                for (int j = 0; j < n; j++) {
                    if (str.charAt(j) == '1') {
                        one += 1;
                    } else {
                        zero += 1;
                    }
                }
                if ((one % 2 == 0 && zero % 2 == 0)||(one==zero)||(one==n)||(zero==n)) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            } else {
                System.out.println("YES");
            }

            s.clear();

        }
        sc.close();
    }
}
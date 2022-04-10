import java.util.Scanner;

/**
 * A_Do_Not_Be_Distracted_
 */

public class A_Do_Not_Be_Distracted_ {

    public static void main(String[] args) {
        int t;
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = 0, flag = 0;
            String word;
            n = sc.nextInt();
            int alphabet[] = new int[26];
            word = sc.next();
            alphabet[word.charAt(0) - 'A'] = 1;
            for (int j = 1; j < n; j++) {
                if (word.charAt(j) == word.charAt(j - 1)) {
                    continue;
                } else {
                    if (alphabet[word.charAt(j) - 'A'] > 0) {
                        flag = 1;
                        break;

                    }
                    alphabet[word.charAt(j) - 'A'] = 1;

                }
            }

            if (flag == 1) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }

        }
    }
}
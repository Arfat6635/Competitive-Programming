import java.util.Scanner;

/**
 * Whats_in_the_Name
 */
public class Whats_in_the_Name {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();

        while (t-- > 0) {
            String str = sc.nextLine();
            String s[]=str.split(" ");
      

            for (int i = 0; i < s.length - 1; i++) {
                char c = s[i].charAt(0);
                System.out.print(Character.toUpperCase(c));
                System.out.print(". ");
            }
            String s1 = s[s.length - 1];
            System.out.print(Character.toUpperCase(s1.charAt(0)));
            System.out.print(s1.substring(1).toLowerCase());
            System.out.println();

        }
        sc.close();

    }
}
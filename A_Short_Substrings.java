import java.util.*;

/**
 * A_Short_Substrings
 */
public class A_Short_Substrings {

    public static void main(String[] args) {
        String b = "", a = "";
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        while (n > 0) {
            b = sc.next();
            char[] ch = new char[b.length()];

            for (int j = 0; j < b.length(); j++) {
                ch[j] = b.charAt(j);
                //character array
            }

            if (b.length() > 2) {
                a+=ch[0]; //initialize the string with first string
                for (int i = 0; i < b.length(); i++) {
                    if (i%2!=0) {
                    a += ch[i];
                    //if not even then add the character to the string
                    }
                }
                System.out.println(a);
            } else {
                System.out.println(b);
            }
            n -= 1;
            a = "";

        }

    }
}
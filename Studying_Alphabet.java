import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Studying_Alphabet
 */
public class Studying_Alphabet {

    public static void main(String[] args) {
        String str;
        int n=0;
        Scanner sc=new Scanner(System.in);
        str=sc.next();
        n=sc.nextInt();
        while (n-->0) {
            int c=0;
            String word=sc.next();
            for (int i = 0; i < word.length(); i++) {
                if (str.contains(word.charAt(i)+"")) {
                    c+=1;
                }
            }

            if (c==word.length()) {
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
        }

        sc.close();
        

        
    }
}
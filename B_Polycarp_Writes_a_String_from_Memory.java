import java.util.*;
import java.util.Scanner;

/**
 * B_Polycarp_Writes_a_String_from_Memory
 */
public class B_Polycarp_Writes_a_String_from_Memory {

    public static void main(String[] args) {
        int t;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        while (t-->0) {
            String s="";
            int c=0;
            s=sc.next();
           Set<String> set = new HashSet<>();
           for (int i = 0; i < s.length(); i++) {
                set.add(String.valueOf(s.charAt(i)));

                if (set.size()>3) {
                    c+=1;
                    set.clear();
                }
                set.add(String.valueOf(s.charAt(i)));
                

           }
           if (set.size()!=0) {
            c+=1;
           }
           System.out.println(c);
        }
        sc.close();
    }
}
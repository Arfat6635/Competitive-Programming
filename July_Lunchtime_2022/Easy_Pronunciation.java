import java.util.ArrayList;
import java.util.Scanner;

/**
 * Easy_Pronunciation
 */
public class Easy_Pronunciation {

    public static void main(String[] args) {
        int t;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        while (t-->0) {
            int n, flag=0,c=0;
            String s="";
            n=sc.nextInt();
            s=sc.next();
            for (int i = 0; i < n; i++) {
                if (s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u') {
                    c=0;
                }else{
                
                        c+=1;
                }

                if (c>=4) {
                    flag=1;
                    break;
                }

            }
            if (flag==1) {
                System.out.println("NO");
            }else{
                System.out.println("YES");
            }
        }
        sc.close();

    }
}
import java.util.Scanner;

/**
 * Distinct_Binary_Strings
 */
public class Distinct_Binary_Strings {

    public static void main(String[] args) {
        int t;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        while (t-->0) {
            int n,count=0;
            String s;
            n=sc.nextInt();
            s=sc.next();
            String[] str = s.split("");

            for (int i = 0; i < n-1; i++) {
                if (!(str[i].equals(str[i+1]))) {
                    count+=1;
                }
            }

            System.out.println(count+1);


            }
        
        sc.close();
    }
}
import java.util.Scanner;

/**
 * Rearranging_digits_to_get_a_multiple_of_5
 */
public class Rearranging_digits_to_get_a_multiple_of_5 {

    public static void main(String[] args) {
        int t;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        while (t-->0) {
            String num;
            int n, flag=0;
            n=sc.nextInt();
            num=sc.next();
            char arr[]=num.toCharArray();
            for (int i = 0; i < n; i++) {
                if (arr[i]=='0'||arr[i]=='5') {
                    flag=1;
                    break;
                    
                }
            }
            if (flag==1) {
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }
        sc.close();
    }
}
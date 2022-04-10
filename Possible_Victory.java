import java.util.Scanner;

/**
 * Possible_Victory
 */
public class Possible_Victory {

    public static void main(String[] args) {
        int r,o,c,result=0;
        Scanner sc=new Scanner(System.in);
        r=sc.nextInt();
        o=sc.nextInt();
        c=sc.nextInt();

        result=c+(((20-o)*6)*6);

        if (result>r) {
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
        sc.close();
    }
    
}
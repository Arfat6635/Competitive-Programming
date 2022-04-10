import java.util.Scanner;

/**
 * Chef_and_Stock_Prices_
 */
public class Chef_and_Stock_Prices_ {

    public static void main(String[] args) {
        int t;
        Scanner sc= new Scanner(System.in);
        t=sc.nextInt();
        while (t-->0) {
            Double s, a, b, c, price;

            s=sc.nextDouble();
            a=sc.nextDouble();
            b=sc.nextDouble();
            c=sc.nextDouble();

            price=(s+((s * c)/100));

            if (price>=a && price<=b) {
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
            
            
        }
        sc.close();
    }
}
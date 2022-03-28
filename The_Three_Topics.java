import java.util.Scanner;

/**
 * The_Three_Topics
 */
public class The_Three_Topics {

    public static void main(String[] args) {
        int a,b,c,x;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        x=sc.nextInt();
        if (x==a||x==b||x==c) {
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        sc.close();
    }
}
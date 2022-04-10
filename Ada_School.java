import java.util.Scanner;

/**
 * Ada_School
 */
public class Ada_School {

    public static void main(String[] args) {
        int t;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        while (t-->0) {
            int r,c;
            r=sc.nextInt();
            c=sc.nextInt();
            if (c%2==1 && r%2==1) {
                System.out.println("NO");
            }
            else{
                System.out.println("YES");
            }
        }
        sc.close();
    }
}
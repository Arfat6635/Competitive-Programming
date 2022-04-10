import java.util.Scanner;

/**
 * Count_the_Notebooks
 */
public class Count_the_Notebooks {

    public static void main(String[] args) {
        int t;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        while (t-->0) {
            int n;
            n=sc.nextInt();
            System.out.println((n*1000)/100);
        }
        sc.close();
    }
}
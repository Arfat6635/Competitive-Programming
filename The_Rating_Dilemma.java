import java.util.Scanner;

/**
 * The_Rating_Dilemma
 */
public class The_Rating_Dilemma {

    public static void main(String[] args) {
        int t;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        while (t-->0) {
            int sum, x=1,y=0;
            sum=sc.nextInt();
            y=-x-sum;
            System.out.println(y);
        }
        sc.close(); 
    }
}
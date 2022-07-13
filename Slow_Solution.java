import java.util.Scanner;

/**
 * Slow_Solution
 */
public class Slow_Solution {

    public static void main(String[] args) {
        int t;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        while (t-->0) {
            int maxT=0, maxN=0, sumN=0;
            long c=0;
            maxT=sc.nextInt();
            maxN=sc.nextInt();
            sumN=sc.nextInt();
            while (maxT>0 && sumN>0) {
                int n=Math.min(maxN, sumN);
                c+=n*n;
                maxT-=1;
                sumN-=n;
            }
            System.out.println(c);
        }
        sc.close();
    }
}
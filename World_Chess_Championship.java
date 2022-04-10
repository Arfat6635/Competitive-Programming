import java.util.Scanner;

/**
 * World_Chess_Championship
 */
public class World_Chess_Championship {

    public static void main(String[] args) {
        int t;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        while (t-->0) {
            int prize=0,c=0,n=0,d=0;
            String x;
            prize=sc.nextInt();
            x=sc.next();
            for (int i = 0; i < x.length(); i++) {
                if (x.charAt(i)=='C') {
                    c+=1;
                }
                else if (x.charAt(i)=='N') {
                    n+=1;
                }
                else if(x.charAt(i)=='D'){
                    c+=1;
                    n+=1;
                }
            }

            if (c>n) {
                System.out.println(60*prize);
            }
            else if (c<n) {
                System.out.println(40*prize);
            }
            else if (c==n) {
                System.out.println(55*prize);
            }

        }
        sc.close();
    }
}
import java.util.Scanner;

// 1  0 = -1
// 2 - 1 0 = 1
// 3 1 0 -1 = -2
// 4 -2 -1 0 1 = 2
// 5 2 1 0 -1 -2 = -3

/**
 * Sign_Moves
 */
public class Sign_Moves {

    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        while (n-->0) {
            int x;
            x=sc.nextInt();
            if((x & 1) == 1){
                System.out.println("-" + "" +(x+1)/2);
            }else{
                System.out.println((x+1)/2);
            }
        }
        sc.close();
    }
}
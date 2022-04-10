import java.util.Scanner;

/**
 * A_Mishka_and_Game
 */
public class A_Mishka_and_Game {

    public static void main(String[] args) {
        int n, countM=0 , countC=0, m=0, c=0;
        Scanner sc= new Scanner(System.in);
        n=sc.nextInt();
        while (n>0) {
            
            m=sc.nextInt();
            c=sc.nextInt();

            if (m>c) {
                countM+=1;
            }
            else if(c>m){
                countC+=1;
            }
            
            n-=1;
        }
        if ( countM>countC) {
            System.out.print("Mishka");

        }
        else if ( countC>countM) {
            System.out.print("Chris");
        }
        else{
            System.out.print("Friendship is magic!^^");
        }

        sc.close();
    }
}
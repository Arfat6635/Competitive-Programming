import java.util.Scanner;

/**
 * A_Ilya_and_Bank_Account
 */
public class A_Ilya_and_Bank_Account {

    public static void main(String[] args) {
        long a;
        Scanner sc=new Scanner(System.in);
        a=sc.nextLong();
        if (a>0) {
            System.out.print(a);
        }
        else{
            long x,y, z;
            x=a/10;
            z=a%10;
            y=(a/100)*10+(z);

        System.out.print(Math.max(Math.max(a,x),y));
            

        }
        sc.close();
    }
}
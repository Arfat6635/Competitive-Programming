import java.nio.channels.FileChannel.MapMode;
import java.util.Scanner;

/**
 * Chef_and_Socks
 */
public class Chef_and_Socks {

    public static void main(String[] args) {
        int jacketCost, socksCost, Money, x;
        Scanner sc = new Scanner(System.in);
        jacketCost = sc.nextInt();
        socksCost = sc.nextInt();
        Money = sc.nextInt();
        Money = Money - jacketCost;
        x = Money / socksCost;
        if (x % 2 == 0) {
            System.out.println("Lucky Chef");
        } else {
            System.out.println("Unlucky Chef");
        }

        sc.close();
    }
}
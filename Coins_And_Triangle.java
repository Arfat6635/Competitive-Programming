import java.util.Scanner;

/**
 * Coins_And_Triangle
 */
public class Coins_And_Triangle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0)
        {
            int coins = sc.nextInt();
            int c = 0;
            for (int i = 1; coins > 0; i++)
            {   
                coins = coins - i;
                c = i;
            }
            if (coins == 0)
                System.out.println(c);
            else
                System.out.println(--c);
        }
        sc.close();
    }
}
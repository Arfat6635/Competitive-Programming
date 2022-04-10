import java.util.Scanner;

public class B_Interesting_drink {

    public static void main(String[] args) {
        int n = 0, days = 0, c = 0;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt(); 
        long shops[] = new long[n];
        for (int i = 0; i < n; i++) {
            shops[i] = sc.nextInt(); 
        }

        days = sc.nextInt(); 
        long coins[] = new long[days];
        for (int j = 0; j < days; j++) { 
            coins[j] = sc.nextLong();

        }



        for (int i = 0; i < days; i++) {
            for (int j = 0; j < n; j++) {
                if (coins[i]>1000000000) {
                    System.out.println(n);
                }
                else if (coins[i] >= shops[j]) {
                    c += 1; 
                }
            }
            System.out.println(c);
            c = 0;
        }

        sc.close();

    }
}
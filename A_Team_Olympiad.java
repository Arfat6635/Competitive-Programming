import java.util.*;

public class A_Team_Olympiad {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        int[][] meow = new int[3][n];
        int x = 0, y = 0, z = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 1) {
                meow[0][x] = i + 1;
                x++;
            } else if (arr[i] == 2) {
                meow[1][y] = i + 1;
                y++;
            } else {
                meow[2][z] = i + 1;
                z++;
            }
        }

        int oup = Math.min(x, y);
        oup = Math.min(oup, z);
        System.out.println(oup);
        for (int j = 0; j < oup; j++) {
            for (int i = 0; i < 3; i++) {
                System.out.print(meow[i][j] + " ");
            }
            System.out.println();
        }

    }
}
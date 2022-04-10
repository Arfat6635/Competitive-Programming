import java.util.Scanner;

/**
 * A_The_New_Year_Meeting_Friends
 */
public class A_The_New_Year_Meeting_Friends {

    public static void main(String[] args) {
        int arr[] = new int[3];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {

            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3 - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.print((arr[0] - arr[1]) + (arr[1] - arr[2]));

    }

}
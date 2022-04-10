import java.util.Scanner;

public class hoffmanInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter elements...");
        char[] a = sc.next().toCharArray();
        System.out.println("Array elements are : ");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        sc.close();
    }

}

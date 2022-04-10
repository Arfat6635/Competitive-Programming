import java.util.Scanner;

/**
 * Chef_and_His_Fruit_Stand
 */
public class Chef_and_His_Fruit_Stand {

    public static void main(String[] args) {
     	int test_cases;
        Scanner scanner=new Scanner(System.in);
        test_cases=scanner.nextInt();
        while (test_cases-->0) {
            int total_bananas=0,total_apples=0;
            total_bananas=scanner.nextInt();
            total_apples=scanner.nextInt();

           if (total_bananas<total_apples*2) {
                System.out.println(total_bananas/2);
            }
            else{
                System.out.println(total_apples);
            }
           }
        scanner.close();
    }
}
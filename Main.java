import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int number = read.nextInt(); // N

        while(number>0) {
            if (number%3==0){
                number = number - 1;
                continue;
            }
            System.out.println(number);
            number = number - 1;
        }

        System.out.println("Done");
        read.close();

    }
}
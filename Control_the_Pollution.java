import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Control_the_Pollution
 */
public class Control_the_Pollution {
    public static void main(String[] args) {
        int t;
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();
        while (t-- > 0) {

            int n, x, y, temp,bus_gas, car_gas;
            double bus, car;
            n = sc.nextInt();
            x = sc.nextInt();
            y = sc.nextInt();

            

            if (n > 100) {
                temp=n;
                bus = (double) (temp%100) / 100;
                car = (double) ((n-(temp%100)) / 4);
                bus_gas = (int) Math.ceil(bus) * x;
                car_gas = (int) Math.ceil(car) * y;
                System.out.println(bus_gas + " "+ n%100);


                

            } else if (n <= 100) {
                bus = (double) n / 100;
                car = (double) n / 4;
                bus_gas = (int) Math.ceil(bus) * x;
                car_gas = (int) Math.ceil(car) * y;

          

                if (bus_gas>car_gas) {
                    System.out.println(car_gas);
                }
                else{
                    System.out.println(bus_gas);
                }
            }

        }
        sc.close();
    }
}
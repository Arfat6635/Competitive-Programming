import java.util.Scanner;

/**
 * Minimum_Number_of_Pizzas
 */
public class Minimum_Number_of_Pizzas {

    public static void main(String[] args) {
      // your code goes here
      int t;
      Scanner sc= new Scanner(System.in);
      t=sc.nextInt();
      while (t-->0) {
          long n, k, c=1;
          n=sc.nextLong();
          k=sc.nextLong();

          if (n==k) {
              System.out.println("1");
          }
          else{
              
              while (k%n!=0) {
                  
                  k=k*2;
                  c+=1;
              }

              System.out.println(c);
          }
      }
    }
}
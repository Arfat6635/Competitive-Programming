import java.util.Scanner;

/**
 * Miami_GP
 */
public class Miami_GP {

    public static void main(String[] args) {

       int t;
       Scanner scanner=new Scanner(System.in);
       t=scanner.nextInt();
       while (t-->0) {
           Double x,y, result=0.00;
           x=scanner.nextDouble();
           y=scanner.nextDouble();
           result=(x/100)*107;
           if (y<=result) {
               System.out.println("YES");
           }else{
               System.out.println("NO");
           }


       }
       scanner.close();
        
    }
}
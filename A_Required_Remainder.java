import java.util.*;
 
public class A_Required_Remainder{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();
		while(t>0){
			int x = input.nextInt(),y = input.nextInt(),n = input.nextInt();
            System.out.println(n-y);
            System.out.println((n-y)/x);
            System.out.println((x+y));
            System.out.println(((n-y)/x)*x+y);

            System.out.println("THE END");
            t-=1;
		}
	}
}
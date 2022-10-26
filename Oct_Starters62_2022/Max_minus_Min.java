import java.util.Scanner;

/**
 * Max_minus_Min
 */
public class Max_minus_Min {

    public static void main(String[] args) {
        int t=0;
		Scanner sc= new Scanner(System.in);
		t=sc.nextInt();
		while(t-->0){
		    int a=0,b=0,c=0;
		    a=sc.nextInt();
		    b=sc.nextInt();
		    c=sc.nextInt();
		    System.out.println((Math.max(a,Math.max(b,c)))-(Math.min(a,Math.min(b,c))));
		}
    }
}
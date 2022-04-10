import java.util.Scanner;

/**
 * Chessboard_Distance
 */
public class Chessboard_Distance {

    public static void main(String[] args) {
        int t;
		Scanner sc=new Scanner(System.in);
		t=sc.nextInt();
		while(t-->0){
		    int x1,y1,x2,y2,a,b;
		    x1=sc.nextInt();
		    y1=sc.nextInt();
		    x2=sc.nextInt();
		    y2=sc.nextInt();
		    a=Math.abs(x1-x2);
            b=Math.abs(y1-y2);
		    System.out.println(Math.max(a,b));
		    
		}
        sc.close();
    }
}
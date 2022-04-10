import java.util.Scanner;

/**
 * Important_Pages_on_CodeChef
 */
public class Important_Pages_on_CodeChef {

    public static void main(String[] args) {
        // your code goes here
        int a,b;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		if ((a==0&&b==1)||(a==0&&b==0)){
		    System.out.println("https://www.codechef.com/practice");
		} else if(a==1&&b==0){
		    System.out.println("https://www.codechef.com/contests");
		}else if(a==1&&b==1){
		    System.out.println("https://discuss.codechef.com");
		}
        sc.close();
    }
}
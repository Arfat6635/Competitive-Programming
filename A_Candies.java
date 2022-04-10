import java.util.*;
public class A_Candies{
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    for(int l=0;l<t;l++){
        int n=sc.nextInt();
		for(int i = 4; i <= n + 1; i *= 2) {
			if(n % (i - 1) == 0) {
				System.out.println(n/(i - 1));
				break;
			}
		}
    }
}
}
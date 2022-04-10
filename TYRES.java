import java.util.Scanner;

public class TYRES {
    public static void main(String[] args) {
    int t;
    Scanner sc=new Scanner(System.in);
    t=sc.nextInt();
    while (t-->0){
        int n,c=0;
        n= sc.nextInt();

        while (n>0){
            if (n>=4){
                n-=4;
            }
            else{
                n-=4;
                c+=1;
            }
        }
        if ((c > 0)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    sc.close();

    }
}

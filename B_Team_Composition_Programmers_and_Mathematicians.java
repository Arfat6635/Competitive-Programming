import java.util.Scanner;

/**
 * B_Team_Composition_Programmers_and_Mathematicians
 */
public class B_Team_Composition_Programmers_and_Mathematicians {

    public static void main(String[] args) {
        int t;
        Scanner sc= new Scanner(System.in);
        t=sc.nextInt();
        while (t>0) {
            int a=0,b=0, c=0;

            a=sc.nextInt();
            b=sc.nextInt();

           
                while (a>0 &&b>0) {

                    if (a<=2 && b>=3) {
                        a-=1;
                        b-=3;
                        c+=1;
                    }
                    else if (a>=3 && b<=2) {
                        a=-3;
                        b=-1;
                        c+=1;
                    }
                    else{
                    a-=2;
                    b-=2;
                    c+=1;
                    }

                   
                }

            
            
            System.out.println(c);
            t-=1;
        }
    }
}
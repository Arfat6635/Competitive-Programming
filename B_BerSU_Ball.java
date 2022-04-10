import java.util.Scanner;

/**
 * B_BerSU_Ball
 */
public class B_BerSU_Ball {

    public static void main(String[] args) {
        int n, m, sum=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        
        int boys[]=new int[n];

        for (int i = 0; i < n; i++) {
            boys[i]=sc.nextInt();
        }

        m=sc.nextInt();

        int girls[]=new int[m];

        for (int i = 0; i < m; i++) {
            girls[i]=sc.nextInt();
        }

        //sorting boys array in ascend

        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (boys[j]>boys[j+1]) {
                    int temp=boys[j];
                    boys[j]=boys[j+1];
                    boys[j+1]=temp;
                }
            }
        }

        //sorting girls array in ascend

        for (int i = 0; i < m-1; i++) {
            for (int j = 0; j < m-i-1; j++) {
                if (girls[j]>girls[j+1]) {
                    int temp=girls[j];
                    girls[j]=girls[j+1];
                    girls[j+1]=temp;
                }
            }
        }


        //if the boy skill is matched or differ with 1 in increasing or decreasing way then 
        //count +1 it
        //if the boys and girls skill gap differ more than +1 then dont count it

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (boys[i]==girls[j]||boys[i]+1==girls[j]||boys[i]-1==girls[j]) {
                    sum+=1;
                    girls[j]=-2;
                    break;
                }
            }
        }

        System.out.print(sum);

    }
}
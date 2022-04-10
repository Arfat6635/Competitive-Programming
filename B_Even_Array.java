import java.util.Scanner;

/**
 * B_Even_Array
 */
public class B_Even_Array {

    public static void main(String[] args) {
        int t;
        Scanner sc= new Scanner(System.in);
        t=sc.nextInt();
        while (t>0) {
            int size, even=0, odd=0;;
            size=sc.nextInt();
            int arr[]=new int[size];
            for (int i = 0; i < size; i++) {
                arr[i]=sc.nextInt();
            }

            for (int j = 0; j < size; j++) {
                if (j%2!=arr[j]%2) {
                    if (j%2==0) {
                        even+=1;
                    }
                    else{
                        odd+=1;
                    }
                }
                
            }   

            if (odd==even) {
                System.out.println(even);
            }
            else{
                System.out.println("-1");
            }
            t-=1;
        }
        sc.close();
    }
}
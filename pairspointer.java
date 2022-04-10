import java.util.*;

public class pairspointer{
    //find the sum variable using 2 pointer approach 
    public static void pairs(int arr[],int sum){
        Arrays.sort(arr);
        int j=arr.length-1;    
        for (int i = 0; i <j; i++) {
            if (arr[i]+arr[j]>sum) {
                j-=1;
            }
            else if (arr[i]+arr[j]<sum) {
                    i+=1;
            }
            else{
                System.out.println(arr[i]+" "+arr[j]);
                j--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,7};
        int sum=6;
        pairs(arr, sum);
    }
}
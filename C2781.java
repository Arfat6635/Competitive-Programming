/**
 * C2781
 */
public class C2781 {

    public static int findFinalValue(int[] nums, int original) {

        int len=nums.length;

        for (int i = 0; i < len; i++) {
            if (nums[i]==original) {
                original=2*original;
                i=0;
                i-=1;
            }
        }
        

        return original;
        
    }

    public static void main(String[] args) {
        int arr[]={8,19,4,2,15,3};
        int n=2;
        System.out.println(findFinalValue(arr,n));
    }
}
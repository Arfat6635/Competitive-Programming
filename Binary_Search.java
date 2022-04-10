/**
 * Binary_Search
 */
public class Binary_Search {

    public static int search(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (target==nums[i]) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[]={-1,0,3,5,9,12};
        System.out.println(search(arr, 2));
    }
}
import javax.swing.border.EmptyBorder;

public class Bad_Version {

    public static int firstBadVersion(int n) {

        if (n==1) {
            return 1;
        }

        int first=0;
        int end=n;

        while (first<=end) {
            int mid=first-(end-first)/2;

            if (isBadVersion(mid)==true && isBadVersion(mid-1)==true) {
                end=mid-1;
            }
            else if (isBadVersion(mid)==true && isBadVersion(mid-1)==false) {
                return mid;
            }

        }

       
        return -1;
        
    }

    private static boolean isBadVersion(int mid) {
        return false;
    }

    public static void main(String[] args) {
        
    }
    
}

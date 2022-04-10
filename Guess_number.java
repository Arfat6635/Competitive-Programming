public class Guess_number {
    public static  int guessNumber(int n) {
        int first=0, last=n;
        while(first<last){
            int mid=first+last/2;
            if (0==guessNumber(mid)) {
                return mid;
            }
            else if (-1==guessNumber(mid)) {
                last=mid-1;
            }
            else if (1==guessNumber(mid)) {
                first=mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        
    }
    
}

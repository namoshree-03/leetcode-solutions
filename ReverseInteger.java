public class ReverseInteger {
    public int reverse(int x) {
        int reversed = 0;
        while (x!=0){
            if (reversed > Integer.MAX_VALUE / 10 || (reversed == Integer.MAX_VALUE / 10 && x % 10 > 7)) {
                return 0;
            }
            // Check for negative overflow
            if (reversed < Integer.MIN_VALUE / 10 || (reversed == Integer.MIN_VALUE / 10 && x % 10 < -8)) {
                return 0;
            }
            int digit = x%10;
            reversed = reversed*10 + digit;
            x=x/10;

        }
        return reversed;
    }
}

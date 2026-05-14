public class CheckIfArrayIsGood {
    public boolean isGood(int[] nums) {
        int max = nums[0];

        for (int n : nums) {
            if (n > max) {
                max = n;
            }
        }

        if (nums.length != max + 1) {
            return false;
        }

        int[] freq = new int[max + 1];
        for (int n : nums) {
            if (n > max || n < 1) {
                return false;
            }
            freq[n]++;
        }

        for (int i = 1; i < max; i++) {
            if (freq[i] != 1) {
                return false;
            }
        }

        if (freq[max] != 2) {
            return false;
        }

        return true;
    }
}

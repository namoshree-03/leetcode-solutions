public class MinimumOperationsToMakeArrayIncreasing {
    public int minOperations(int[] nums) {
        int count = 0;

        for (int i = 1; i < nums.length; i++)
        {
            if (nums[i] <= nums[i - 1])
            {
                int needed = nums[i - 1] + 1;
                count += needed - nums[i];
                nums[i] = needed;
            }
        }
        return count;
    }
}

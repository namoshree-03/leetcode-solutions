class LeftandRightSum {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        // Step 1: Find total sum
        int total = 0;
        for (int x : nums) total += x;

        // Step 2: Traverse once keeping track of leftSum
        int leftSum = 0;
        for (int i = 0; i < n; i++) {
            int rightSum = total - leftSum - nums[i];
            result[i] = Math.abs(leftSum - rightSum);
            leftSum += nums[i];  // update for next index
        }
        return result;
    }
}

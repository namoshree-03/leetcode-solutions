public class FindClosestNumberToZero {
    public int findClosestNumber(int[] nums) {
        int ans = nums[0];

        for(int i = 0; i < nums.length; i++){
            if(Math.abs(nums[i]) < Math.abs(ans) ||
                    (Math.abs(nums[i]) == Math.abs(ans) && nums[i] > ans)){
                ans = nums[i];
            }
        }
        
        return ans;
    }
}

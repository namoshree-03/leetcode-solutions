public class ConcatenationOfArray {
    public int[] getConcatenation(int[] nums) {
        int[] arr = new int[2*(nums.length)];
        int k = 0;
        int n = nums.length;
        for(int i = 0; i<nums.length; i++){
            arr[k] = nums[i];
            arr[n] = nums[i];

            k++;
            n++;
        }

        return arr;
    }
}

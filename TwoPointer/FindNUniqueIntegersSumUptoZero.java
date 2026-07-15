public class FindNUniqueIntegersSumUptoZero {
    public int[] sumZero(int n) {
        int[] ans = new int[n];
        int left = 0;
        int right = n-1;
        int num = 1;
        while(left<right){
            ans[left] = -num;
            ans[right] = num;

            left++;
            right--;
            num++;
        }
        if(left == right){
            ans[left] = 0;
        }
        return ans;
    }
}

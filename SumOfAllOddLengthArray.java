public class SumOfAllOddLengthArray {
        public int sumOddLengthSubarrays(int[] arr) {
            int n = arr.length;
            int totalSum = 0;

            for (int i = 0; i < n; i++) {
                int totalSubarrays = (i + 1) * (n - i);
                int oddCount = (totalSubarrays + 1) / 2;
                totalSum += arr[i] * oddCount;
            }

            return totalSum;
        }
}

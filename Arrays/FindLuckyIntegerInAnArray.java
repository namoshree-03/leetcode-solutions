public class FindLuckyIntegerInAnArray {
    public int findLucky(int[] arr) {
        int ans = -1;
        for (int i = 0; i < arr.length; i++) {
            boolean alreadyCounted = false;
            for (int k = 0; k < i; k++) {
                if (arr[k] == arr[i]) {
                    alreadyCounted = true;
                    break;
                }
            }

            if (alreadyCounted) {
                continue;
            }

            int count = 1;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            if (count == arr[i]) {
                ans = Math.max(ans, arr[i]);
            }
        }

        return ans;
    }
}

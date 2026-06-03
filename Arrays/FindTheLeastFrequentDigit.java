public class FindTheLeastFrequentDigit {
    public int getLeastFrequentDigit(int n) {
        int[] freq = new int[10];

        while (n > 0) {
            int digit = n % 10;
            freq[digit]++;
            n /= 10;
        }

        int answer = -1;
        int minFreq = Integer.MAX_VALUE;

        for (int d = 0; d <= 9; d++) {
            if (freq[d] > 0 && freq[d] < minFreq) {
                minFreq = freq[d];
                answer = d;
            }
        }
        return answer;
    }
}

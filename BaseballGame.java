public class BaseballGame {
    public int calPoints(String[] operations) {
        int n = operations.length;
        int[] res = new int[n];
        int pointer = 0;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            if (operations[i].equals("C")) {
                pointer--;
                sum -= res[pointer];
            }
            else if (operations[i].equals("D")) {
                res[pointer] = 2 * res[pointer - 1];
                sum += res[pointer];
                pointer++;
            }
            else if (operations[i].equals("+")) {
                res[pointer] = res[pointer - 1] + res[pointer - 2];
                sum += res[pointer];
                pointer++;
            }
            else {
                res[pointer] = Integer.parseInt(operations[i]);
                sum += res[pointer];
                pointer++;
            }
        }

        return sum;
    }
}

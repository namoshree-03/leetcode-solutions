public class CountTestedDevicesAfterTestOperations {
    public int countTestedDevices(int[] batteryPercentages) {
        int count = 0;
        int used = 0;

        for (int i = 0; i < batteryPercentages.length; i++) {
            if (batteryPercentages[i] - used > 0) {
                count++;
                used++;
            }
        }
        return count;
    }
}

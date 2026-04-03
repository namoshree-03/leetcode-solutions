public class ValidPerfectSquare {
    public boolean isPerfectSquare(int num)
    {
        if (num < 2) return true;

        int left = 1;
        int right = num / 2;

        while (left <= right)
        {
            int mid = left + (right - left) / 2;
            int div = num / mid;

            if (div == mid && num % mid == 0)
            {
                return true;
            }

            else if (div < mid)
            {
                right = mid - 1;
            }

            else
            {
                left = mid + 1;
            }
        }
        return false;
    }
}

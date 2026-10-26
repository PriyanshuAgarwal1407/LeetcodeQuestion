class Solution {
    public int sqrt(int n) {
        if (n == 0) return 0;

        int lo = 1, hi = n;
        int ans = 0;

        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (mid <= n / mid) {
                ans = mid;
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }

        return ans;
    }
    public int arrangeCoins(int n) {
        long value = 8L * n + 1;
        long root = (long) Math.sqrt(value);

        return (int) ((root - 1) / 2);
    }
}
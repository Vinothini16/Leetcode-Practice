class Solution {
    public int climbStairs(int n) {
        if (n == 1) return 1;
        if (n == 2) return 2;

        int fir= 1, sec= 2, th= 0;
        for (int i = 3; i <= n; i++) {
            th= fir + sec;
            fir = sec;
            sec = th;
        }
        return sec;
    }
}

class Solution {
    public int climbStairs(int n) {
        if (n <= 3) return n;

        int[] waysToClimb = new int[n+1];
        waysToClimb[0] = waysToClimb[1] = 1;

        for (int i = 2; i < n+1; i++) {
            waysToClimb[i] = waysToClimb[i-1] + waysToClimb[i-2];
        }
        return waysToClimb[n];
    }
}
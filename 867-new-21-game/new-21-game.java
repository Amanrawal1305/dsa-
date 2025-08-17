class Solution {
    public double new21Game(int N, int K, int maxPts) {
        if (K == 0 || N >= K - 1 + maxPts) return 1.0;

        double[] dp = new double[maxPts]; 
        dp[0] = 1.0;
        double ws = 1.0, result = 0.0;

        for (int i = 1; i <= N; i++) {
            double prob = ws / maxPts;
            
            if (i < K) {
                ws += prob;
            } else {
                result += prob;
            }

            if (i >= maxPts) {
                ws -= dp[i % maxPts];
            }

            dp[i % maxPts] = prob;
        }

        return result;
    }
}
package dynamic.programming;

public class NthCatalan {

    /**
     * exercise basic
     * find the nth catalan number using dynamic programming
     */
    public static void main(String... args){
        int n = 4;
        System.out.println( findNthCatalanNumber(n));
    }

    private static int findNthCatalanNumber(int n) {
        if( n <= 1) return 1;

        int[] dp = new int[n + 1];

        dp[0] = dp[1] = 1;
        for(int i = 2; i <= n; i++){
            for (int j = 0; j < i ; j++) {
                dp[i] += dp[j] * dp[i - j - 1];
            }
        }
        return dp[n];
    }


}

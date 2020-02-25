package dynamic.programming;

import java.util.Arrays;

public class SubsetSumProblem {
    public static void main(String args[]){
        int[] arr = new int[]{3, 34, 4, 12, 5, 2};
        isSubsetSum(arr, 9, arr.length);
    }

    private static boolean isSubsetSum(int arr[], int sum, int element){
            boolean[][] dp = new boolean[element + 1][sum + 1];
            for(int i = 0; i <= element; i++){
                for(int j = 0; j <= sum; j++){
                    if(i == 0) dp[i][j] = false;
                    else if(j == 0 && i >= 1) dp[i][j] = true;
                    else{
//                        if(j >= arr[i - 1])
//                            dp[i][j] = dp[i - 1][j] || dp[i][j - arr[i - 1]];
//                        else
//                            dp[i][j] = dp[i - 1][j];
                    }

                }
            }

            for(int i = 0; i <= element; i++){
                System.out.println(Arrays.toString(dp[element]));
            }

            return dp[element][sum];
    }
}

package Exercises;

import java.util.ArrayList;
import java.util.List;

public class Permutation2 {
    public static void main(String[] args) {
        List<List<Integer>> ans = new ArrayList<>();
        permutation(new int[]{1, 2, 3}, ans, new ArrayList<>(), new boolean[3]);
        Utils.printListListInt(ans);
    }

    private static void permutation(int nums[], List<List<Integer>> ans, List<Integer> actual, boolean visited[]){
        if(actual.size() == nums.length)
            ans.add(new ArrayList<>(actual));
        for(int i = 0; i < nums.length; i++){
            if(visited[i]) continue;
            visited[i] = true;
            actual.add(nums[i]);
            permutation(nums, ans, actual , visited);
            actual.remove(actual.size() - 1);
            visited[i] = false;
        }
    }
}

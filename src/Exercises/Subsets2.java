package Exercises;

import java.util.ArrayList;
import java.util.List;

public class Subsets2 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3,4};
        List<List<Integer>> ans = new ArrayList<>();
        subsets(nums, ans, new ArrayList<>(), 0);
        Utils.printListListInt(ans);
    }

    public static void subsets(int[] nums,List<List<Integer>> ans, List<Integer> actual , int ini){
        ans.add(new ArrayList<>(actual));
        for(int i = ini; i < nums.length; i++){
            actual.add(nums[i]);
            subsets(nums, ans, actual, i + 1);
            actual.remove(actual.size() -1);
        }

    }
}

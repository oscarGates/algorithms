package Exercises;

import java.util.ArrayList;
import java.util.List;

public class Subset3 {
    public static void main(String[] args) {
        List<List<Integer>> ans = new ArrayList<>();
        subset(new int[]{1, 2, 3}, ans, new ArrayList<>(), 0);
        for(List<Integer> li : ans){
            for(Integer i: li){
                System.out.print(i);
            }
            System.out.println();
        }
    }

    public static void subset(int nums[], List<List<Integer>> ans, List<Integer> actual, int ini){
        ans.add(new ArrayList<>(actual));
        for(int i = ini; i < nums.length; i++){
            actual.add(nums[i]);
            subset(nums, ans, actual, i + 1);
            actual.remove(actual.size() - 1);
        }
    }
}

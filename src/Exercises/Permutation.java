package Exercises;

import java.util.ArrayList;
import java.util.List;

public class Permutation {
    public static void main(String[] args) {
        List<List<Integer>> ans = new ArrayList<>();
        permutation(new int[]{1,2 ,3}, ans, new ArrayList<>(), new boolean[3]);
        for(List<Integer> i: ans){
            System.out.print("[");
            for (int j: i) {
                System.out.print(j + ", ");
            }
            System.out.print("]");

            System.out.println();
        }
    }

    public static void permutation(int[] nums, List<List<Integer>> ans, List<Integer> actual, boolean[] blocked){
        if(actual.size() == nums.length)
            ans.add(new ArrayList<>( actual));

        for(int i = 0; i < nums.length; i++){
            if(blocked[i]) continue;
            blocked[i] = true;
            actual.add( nums[i]);
            permutation(nums, ans, actual, blocked);
            actual.remove(actual.size() - 1);
            blocked[i] = false;
        }

    }
}

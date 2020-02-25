package Exercises;

import java.util.List;

public class Utils {
    public static void printListListInt(List<List<Integer>> ans){
            for(List<Integer> li: ans){
                for(Integer i: li){
                    System.out.print(i);
                }
                System.out.println();
            }

    }
}

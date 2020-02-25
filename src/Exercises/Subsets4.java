package Exercises;

import java.util.HashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class Subsets4 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        Map<String, Integer> ans = new HashMap<>();

        SortedMap<Integer, String> sm =
                new TreeMap<Integer, String>();
        String colors[] = new String[]{"yellow", "green", "red", "blue", "black", "yellow1", "green1", "red1", "blue1", "black1"};
        map.put(colors[0], 10);
        map.put(colors[1], 15);
        map.put(colors[2], 20);
        map.put(colors[3], 25);
        map.put(colors[4], 30);
        map.put(colors[5], 10);
        map.put(colors[6], 15);
        map.put(colors[7], 20);
        map.put(colors[8], 25);
        map.put(colors[9], 30);
        subsets(colors, 0, "" , 0, map, sm);
        for(Integer s: sm.keySet()) {
            System.out.println( s  + "," + sm.get(s));
        }

    }

    public static void subsets(String[] colors, int weightActual, String actual, int ini, Map<String, Integer> map, SortedMap<Integer, String> sm ){

        for(int i = ini; i < colors.length; i++){
            sm.put( weightActual + map.get(colors[i]), actual+ "  "+ colors[i]);
            subsets(colors, weightActual + map.get(colors[i]), actual+ "  "+colors[i], i + 1 , map, sm);

        }
    }
}

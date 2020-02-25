package Exercises;

public class Subsets {

    public static void generateSubsets(String s, String actual, int ini, int fin){
        if(ini == fin )
            return;
        for(int i = ini; i < fin; i++){
            System.out.println(actual + s.charAt(i));
            generateSubsets(s,actual + s.charAt(i), i + 1, fin);
        }
    }

    public static void main(String... args){
        String word = "1234567891011";
        generateSubsets(word, "", 0, word.length());
    }
}

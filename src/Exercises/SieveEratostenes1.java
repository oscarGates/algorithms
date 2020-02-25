package Exercises;

public class SieveEratostenes1 {
    public static void main(String[] args) {
        primeNumbers(20);
    }

    public static void primeNumbers(int n){
        boolean[] marked = new boolean[n + 1];

        for(int i = 2; i <= n; i++){
            if(marked[i]) continue;

            for(int j = i + i; j <= n; j += i)
                marked[j] = true;

            if(i* i > n) break;
        }

        for(int i = 2; i <= n; i++ )
            if(!marked[i])
                System.out.println(i);
    }
}

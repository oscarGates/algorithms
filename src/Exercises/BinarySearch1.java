package Exercises;

public class BinarySearch1 {

    public static void main(String[] args) {
        int arr[] = { 2, 3, 4, 10, 40 };
        System.out.println(binarySearch(arr, 0, arr.length, 2));
    }

    public static int binarySearch(int[] arr, int ini, int fin, int n){
        int mid = ini + (fin - ini) / 2;
        if(ini > fin)
            return -1;
        if(arr[mid] == n)
            return mid;
        if(arr[mid] > n)
            return  binarySearch(arr, ini, mid - 1, n);
        return  binarySearch(arr, mid + 1, fin, n);
    }
}

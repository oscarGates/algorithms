package dynamic.programming;

public class BellNumber {

    public static void main(String[] args) {

    }

    public int  Bell(int i, int j, int bellTriangle[][]){
        if(i == 0 && j ==0) return 1;
        if (j == 0)
         bellTriangle[i][j]= Bell(i-1, i-1, bellTriangle);
        else
        bellTriangle[i][j]= Bell(i-1, j-1, bellTriangle) + Bell(i, j-1, bellTriangle);
        return bellTriangle[i][j];
    }
}

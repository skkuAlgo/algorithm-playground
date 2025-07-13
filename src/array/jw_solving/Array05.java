package array.jw_solving;

import java.util.Arrays;
import java.util.Comparator;

public class Array05 {
    public static void main(String[] args) {
//        int[][] arr1 = {{1,4},{3,2},{4,1}};
//        int[][] arr2 = {{3,3},{3,3}};
        int[][] arr1 = {{2,3,2},{4,2,4},{3,1,4}};
        int[][] arr2 = {{5,4,3},{2,4,1},{3,1,1}};
        System.out.println(Arrays.deepToString(solution(arr1, arr2)));
    }
    public static int[][] solution(int[][] arr1, int[][] arr2) {
        int arr1Row = arr1.length; int arr2Col = arr2[0].length;
        int arr1Col = arr1[0].length;

        int[][] answ = new int[arr1Row][arr2Col];
        for(int i=0; i<arr1Row; i++){
            for(int j=0; j<arr2Col; j++){
                for(int k=0; k<arr1Col; k++){
                    answ[i][j] += arr1[i][k]*arr2[k][j];
                }
            }
        }
        return answ;
    }
}

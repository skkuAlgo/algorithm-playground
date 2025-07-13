package array.jw_solving;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Array04 {
    public static void main(String[] args) {
        int[] arr = {1,3,2,4,2};
        System.out.println(Arrays.toString(solution(arr)));
    }
    public static int[] solution(int[] arr) {
        ArrayList<Integer> answ = new ArrayList<Integer>();
        int num1 = 0; int num2 = 0; int num3 = 0;
        int n1 = 0; int n2 = 0; int n3 = 0;
        int[] num1Arr = {1,2,3,4,5};
        int[] num2Arr = {2,1,2,3,2,4,2,5};
        int[] num3Arr = {3,3,1,1,2,2,4,4,5,5};

        for(int i : arr){
            if(i == num1Arr[n1%5]) num1++;
            if(i == num2Arr[n2%8]) num2++;
            if(i == num3Arr[n3%10]) num3++;
            n1++; n2++; n3++;
        }

        int max = Math.max(num1, num2);
        max = Math.max(max, num3);

        if(max == num1) answ.add(1);
        if(max == num2) answ.add(2);
        if(max == num3) answ.add(3);

        return answ.stream().mapToInt(i -> i).toArray();
    }
}

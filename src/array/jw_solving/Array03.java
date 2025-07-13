package array.jw_solving;

import java.util.Arrays;
import java.util.HashSet;

public class Array03 {
    public static void main(String[] args) {
        int[] arr = {5,0,2,7};
        System.out.println(Arrays.toString(solution(arr)));
    }
    public static int[] solution(int[] arr) {
        int len = arr.length;
        int arrLen = (len-1)*len/2;
        int answ[] = new int[arrLen];
        int num = 0;
        for(int i=0; i<len-1; i++) {
            for(int j=i+1; j<len; j++) {
                answ[num] = arr[i] + arr[j];
                num++;
            }
        }

        return Arrays.stream(answ)
                .distinct()
                .boxed()
                .sorted()
                .mapToInt(i->i)
                .toArray();
    }
}

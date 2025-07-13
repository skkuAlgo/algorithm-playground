package array.jw_solving;

import java.util.Arrays;
import java.util.Comparator;

public class Array02 {
    public static void main(String[] args) {
        int[] arr = {5,0,2,7};
        System.out.println(Arrays.toString(solution(arr)));
    }
    public static int[] solution(int[] arr) {
        return Arrays.stream(arr)
                .distinct()
                .boxed()
                .sorted(Comparator.reverseOrder())
                .mapToInt(i->i)
                .toArray();
    }
}

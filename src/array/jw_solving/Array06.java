package array.jw_solving;

import java.util.*;

public class Array06 {
    public static void main(String[] args) {
        int[] arr = {4,4,4,4,4};
        int N = 4;
        System.out.println(Arrays.toString(solution(N, arr)));
    }

    public static int[] solution(int N, int[] arr) {
        HashMap<Integer, Integer> notCleardMap = new HashMap<>();
        HashMap<Integer, Integer> reachedMap = new HashMap<>();
        HashMap<Integer, Double> rateMap = new HashMap<>();
        int[] answ = new int[N];
        for(int i=1; i<=N; i++){
            reachedMap.put(i, 0);
            notCleardMap.put(i, 0);
        }
        for(int i : arr){
            if(i != N+1){
                notCleardMap.put(i, notCleardMap.get(i) + 1);
                for(int j=1; j<=i; j++){
                    reachedMap.put(j, reachedMap.get(j) + 1);
                }
            }
            else{ //i == N+1
                for(int j=1; j<=i-1; j++){
                    reachedMap.put(j, reachedMap.get(j) + 1);
                }
            }
        }
        for(int i=1; i<=N; i++){
            if(reachedMap.get(i) == 0){
                rateMap.put(i, 0.0);
            }
            else{
                rateMap.put(i, (double)notCleardMap.get(i)/(double)reachedMap.get(i));
            }
        }

        List<Map.Entry<Integer, Double>> list = new ArrayList<>(rateMap.entrySet());
        list.sort((a,b) -> {
            if(!a.getValue().equals(b.getValue())){
                return Double.compare(b.getValue(), a.getValue());
            }else{
                return a.getKey() - b.getKey();
            }
        });
        for (int i = 0; i < N; i++) {
            answ[i] = list.get(i).getKey();
        }
        return answ;
    }
}

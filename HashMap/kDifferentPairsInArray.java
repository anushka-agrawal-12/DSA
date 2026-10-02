package HashMap;

import java.util.HashMap;

public class kDifferentPairsInArray {
    public static int kDifferentPairsInArray(int[] arr,int k){
        HashMap<Integer,Integer>map = new HashMap<>();
        for(int num:arr){
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        int count=0;
        if(k==0){
            for(int n:map.keySet()){
                if(map.get(n)>=2){
                    count++;
                }
            }
        }
        else if(k>0){
            for(int n:map.keySet()){
                if(map.containsKey(n+k)){
                    count++;
                }
            }
        }
        return count;
    }
}

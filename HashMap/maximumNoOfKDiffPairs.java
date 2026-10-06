package HashMap;

import java.util.HashMap;

public class maximumNoOfKDiffPairs {
    public static int maximumNoOfKDiffPairs(int[] arr, int k){
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for(int num:arr){
            int complement = k-num;
            if(map.containsKey(complement)){
                count++;
                map.put(complement, map.get(complement)-1);
                if(map.get(complement)==0){
                    map.remove(complement);
                }
            }
            else{
                map.put(num, map.getOrDefault(num,0)+1);
            }
        }
        return count;
    }
}

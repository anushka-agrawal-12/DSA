package prefixSum;

import java.util.HashMap;

public class longestsubarrayWithSumK {
    public static int longestsubarrayWithSumK(int[] arr, int k){
        HashMap<Integer,Integer>map = new HashMap<>();
        map.put(0, -1);
        int prefix =0;
        int length=0;
        int maxLength=0;
        for(int i=0;i<arr.length;i++){
            prefix+=arr[i];
            int needed=prefix-k;
            if(map.containsKey(needed)){
                length=i-map.get(needed);
                maxLength=Math.max(maxLength, length);
            }
            if(!map.containsKey(prefix)){
                map.put(prefix, i);
            }
        }
        return maxLength;
    }
}

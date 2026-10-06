package prefixSum;

import java.util.HashMap;

public class subarraySumEqualsK {
    public static int subarraySumEqualsK(int[] arr, int k){
        HashMap<Integer,Integer>map = new HashMap<>();
        map.put(0, 1);
        int count=0;
        int currprefix = 0;
        for(int i=0;i<arr.length;i++){
            currprefix+=arr[i];
            int needed=currprefix-k;
            if(map.containsKey(needed)){
                count+=map.get(needed);
            }
            map.put(currprefix, map.getOrDefault(currprefix, 0)+1);
        }
        return count;
    }
}

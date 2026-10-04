package prefixSum;

import java.util.HashMap;

public class subarraySumDivisibleByk {
    public static int subarraySumDivisibleByk(int[] arr, int k){
        HashMap<Integer,Integer>map=new HashMap<>();
        map.put(0, 1);
        int prefix=0;
        int count=0;
        for(int i=0;i<arr.length;i++){
            prefix+=arr[i];
            int remainder = ((prefix%k)+k)%k;                  //  it deals with negative values also but simple formula for only positives is prefix%k
            if(map.containsKey(remainder)){
                count+=map.get(remainder);
            }
            map.put(remainder, map.getOrDefault(remainder,0)+1);
        }
        return count;
    }
}

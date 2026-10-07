package HashMap;

import java.util.HashMap;

public class goodPairs {
    public int numIdenticalPairs(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int count=0;
        for(int number:map.keySet()){
            if(map.get(number)>1){
                count+=(map.get(number)*(map.get(number)-1))/2;
            }
        }
        return count;
    }
}

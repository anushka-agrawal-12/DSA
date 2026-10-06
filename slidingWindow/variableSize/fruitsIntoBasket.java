package slidingWindow.variableSize;

import java.util.HashMap;

public class fruitsIntoBasket {
    public static int maxFruits(int[] arr){
        HashMap<Integer,Integer>map = new HashMap<>();
        int k=0; int maxLength=0;
        int left=0;
        for(int right=0;right<arr.length;right++){
            map.put(arr[right], map.getOrDefault(arr[right], 0)+1);
            while(map.size()>2){
                map.put(arr[left], map.getOrDefault(arr[left], 0)-1);
                if(map.get(arr[left])==0){
                    map.remove(arr[left]);
                }
                left++;
            }
            maxLength=Math.max(maxLength, right-left+1);
        }
        return maxLength;
    }
}

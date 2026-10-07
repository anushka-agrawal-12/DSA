package queues;

import java.util.ArrayDeque;
import java.util.Deque;

public class slidingWindowMaximum {
   public static int[] slidingWindowMaximum(int[] arr, int k){
     Deque<Integer>dq = new ArrayDeque<>();
     int[] ans = new int[arr.length-k+1];
     int left=0;
     int right=0;
     int index=0;
     while(right<arr.length){
        if(!dq.isEmpty()&&dq.peekFirst()<left){
            dq.removeFirst();
        }
        while(!dq.isEmpty()&&arr[dq.peekLast()]<arr[right]){
            dq.removeLast();
        }
        dq.addLast(right);
        if(right-left+1==k){
            ans[index++]=arr[dq.peekFirst()];
            left++;
        }
        right++;
     }
     return ans;
   }

}

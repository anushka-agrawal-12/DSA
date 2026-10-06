package slidingWindow.variableSize;

public class minimumSizeSubarraySum {
    public static int minimumSizeSubarraySumK(int[] arr, int k){
        int left=0;
        int sum=0;
        int minLength=Integer.MAX_VALUE;
        int right=0;
        while(right<arr.length){
            if(sum<k){
                sum+=arr[right];
            }
            while(sum>=k){
                minLength=Math.min(right-left+1,minLength);
                sum-=arr[left];
                left++;
            }
            right++;
        }
        if(minLength==Integer.MAX_VALUE){
            return 0;
        }
return minLength;
    }
}

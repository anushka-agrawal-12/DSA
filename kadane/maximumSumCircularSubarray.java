package kadane;

public class maximumSumCircularSubarray {
    public static int maximumSumCircularSubarray(int[] arr){
        int totalSum=arr[0];
        int maxSum=arr[0];
        int minSum=arr[0];
        int currMax=arr[0];
        int currMin=arr[0];
        for(int i=1;i<arr.length;i++){
            totalSum+=arr[i];
            currMax=Math.max(currMax+arr[i],arr[i]);
            maxSum=Math.max(currMax,maxSum);
            currMin=Math.min(currMin+arr[i], arr[i]);
            minSum=Math.min(currMin,minSum);
        }
        if(maxSum<0){
            return maxSum;
        }
        return Math.max(maxSum, totalSum-minSum);          ///////////formula to calculate max wrapped sum->circular sum = totalSum-minSum
    }
}

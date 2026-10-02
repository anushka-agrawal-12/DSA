package prefixSum;

public class runningSumOf1dArray {
    public static int[] runningSum(int[] arr){
        int[] ans = new int[arr.length];
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            ans[i]=sum;
        }
    }
}

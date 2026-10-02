package prefixSum;

public class findPivotIndex {
    public static int pivotIndex(int[] arr){
        int[] prefix = new int[arr.length];
        int sum=0;
        for(int i=0;i<prefix.length;i++){
            prefix[i]=sum;
            sum+=arr[i];
        }
        int[] suffix=new int[arr.length];
        int sum2=0;
        for(int i=suffix.length;i>=0;i--){
            suffix[i]=sum2;
            sum2+=arr[i];
        }
        for(int i=0;i<arr.length;i++){
            if(prefix[i]==suffix[i]){
                return i;
            }
        }
        return -1;
    }
}

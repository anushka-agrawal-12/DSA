package kadane;

public class maximumProductSubarray {
    public static int maximumProductSubarray(int[] arr){
        int maxProduct=arr[0];
        int minProduct=arr[0];
        int answer=arr[0];
        for(int i=1;i<arr.length;i++){
            int num=arr[i];
            int tempMax=maxProduct;
            int tempMin=minProduct;
            maxProduct=Math.max(num, Math.max(tempMax * num, tempMin * num));
            minProduct=Math.min(num, Math.min(tempMax * num, tempMin * num));
            answer = Math.max(maxProduct, answer);

        }
        return answer;
    }
}

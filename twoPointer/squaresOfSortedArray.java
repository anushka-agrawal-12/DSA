package twoPointer;

public class squaresOfSortedArray {
    public static int[] squaresOfSortedArray(int[] arr){
        int left=0;
        int right=arr.length-1;
        int[] ans = new int[arr.length];
        for(int i=ans.length-1;i>=0;i--){
           if(Math.abs(arr[right])>Math.abs(arr[left])){
            ans[i]=arr[right]*arr[right];
            right--;
           }
           else{
            ans[i]=arr[left]*arr[left];
            left++;
           }
        }
        return ans;
    }
}

package prefixSum;

public class productOfArrayExceptSelf {
    public static int[] productOfArrayExceptSelf(int[] arr){
        int[] answer = new int[arr.length];
        int prefix=1;
        for(int i=0;i<answer.length;i++){
            answer[i]=prefix;
            prefix*=arr[i];
        }
        int suffix = 1;
        for(int j=answer.length-1;j>=0;j--){
            answer[j]*=suffix;
            suffix*=arr[j];
        }
        return answer;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int[] result = productOfArrayExceptSelf(arr);
        for(int num:result){
            System.out.print(num+",");
        }
    }
}

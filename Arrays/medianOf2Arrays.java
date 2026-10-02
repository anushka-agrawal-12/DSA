package Arrays;

public class medianOf2Arrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] arr = new int[nums1.length+nums2.length];
        int i=0,j=0,k=0;
        while(i<nums1.length&&j<nums2.length){
            if(nums1[i]<=nums2[j]){
                arr[k++]=nums1[i];
                i++;
            }
            else{
                arr[k++]=nums2[j];
                j++;
            }
        }
        while(i<nums1.length){
            arr[k++]=nums1[i];
            i++;
        }
        while(j<nums2.length){
            arr[k++]=nums2[j];
            j++;
        }
        int low=0,high=arr.length-1;
        if(arr.length%2!=0){
            return arr[low+(high-low)/2];
        }
        else{
            int mid = low+(high-low)/2;
            return (double)(arr[mid]+arr[mid+1])/2;
        }
    }
}

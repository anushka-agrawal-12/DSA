package twoPointer;
import java.util.*;
public class boatsToSavePeople {
    public static int noOfBoats(int[] people, int limit){
        Arrays.sort(people);
        int left=0;
        int right=people.length-1;
        int boats=0;
        while(left<=right){
            if(people[left]+people[right]<=limit){
                left++; right--;                      //both can share a boat
                boats++;
            }
            else{
                right--;
                boats++;
            }
        }
        return boats;
    }
}

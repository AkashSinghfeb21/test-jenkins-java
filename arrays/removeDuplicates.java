// Input: nums = [1,1,2]
// Output: 2, nums = [1,2,_]
// Explanation: Your function should return k = 2, with the first two elements of nums being 1 and 2 respectively.
// It does not matter what you leave beyond the returned k (hence they are underscores).
import java.util.*;
public class removeDuplicates {
    public static int removeDuplicates(int[] nums) {
        int j = 1;
        for(int i=1;i<nums.length;i++){
          if(nums[i]!=nums[i-1]){
              nums[j]=nums[i];
              j++;
          }
        }
        
        return j;
      }
       public static void main(String[]args){
          int[]a = {0,0,1,1,1,2,2,3,3,4,6};
          
          removeDuplicates(a);

          System.out.println(Arrays.toString(a));

          

       }
}

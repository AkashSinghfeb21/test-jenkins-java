import java.util.HashSet;
public class dup {
    public boolean containsDuplicate(int[] nums) {
        // for(int i=0;i<nums.length;i++){
        //     if(nums[i]==nums[i+1]){
        //         return true;
        //     }
        // }
        //  return false;

        HashSet<Integer> set = new HashSet<>();

        for(int i:set){
            if(set.contains(i)){
                return true;
            }

            set.add(i);
        }

        return false;
    }
    public static void main(String[]args){

        int arr[] ={1,2,3,4};

        System.out.println(new dup().containsDuplicate(arr));

    }
}

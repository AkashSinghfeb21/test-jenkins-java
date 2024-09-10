import java.util.HashMap;

public class dup2 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]&& Math.abs(i-j)<=k){
                    return true;
                }
            }
        }
        return false;

        // HashMap<Integer, Integer> map = new HashMap<>();

        // // Iterate through the array
        // for (int i = 0; i < nums.length; i++) {
        //     // If the element already exists in the map, check the index difference
        //     if (map.containsKey(nums[i])) {
        //         int prevIndex = map.get(nums[i]);
        //         if (i - prevIndex <= k) {
        //             return true; // If difference is <= k, return true
        //         }
        //     }

        //     // Update the HashMap with the current index
        //     map.put(nums[i], i);
        // }

        // // No pair found, return false
        // return false;
    }
    public static void main(String[]args){
        int arr[]={1,0,1,1};

        System.out.println(new dup2().containsNearbyDuplicate(arr, 1));
    }
}

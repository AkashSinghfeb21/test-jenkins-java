public class majority {
    public int majorityElement(int[]nums){
        int candidate = 0;
        int count = 0;

        // Phase 1: Find the candidate for the majority element
        for (int num : nums) {
            if (count == 0) {
                candidate = num;  // Set new candidate
            }
            // Increase count if the current element is the candidate, decrease otherwise
            count += (num == candidate) ? 1 : -1;
        }

        // Phase 2: Return the candidate (since it's guaranteed to be the majority)
        return candidate;
    }
    public static void main(String[]args){
        int arr[]={1,1,2,2,1,1};

        System.out.println(new majority().majorityElement(arr));
    }
}

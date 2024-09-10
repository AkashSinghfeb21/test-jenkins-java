public class movezeroes {
    public void moveZeroes(int[] nums) {
        int t=0;
        
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[t]=nums[i];
                t++;
            }
        }

        for(int i=t;i<nums.length;i++){
            nums[i]=0;
        }
    }

    public static void main(String[]args){
        int arr[]={3,0,2,0,1};

        new movezeroes().moveZeroes(arr);

        for(int i:arr){
        System.out.print(i);
        }
    }
}

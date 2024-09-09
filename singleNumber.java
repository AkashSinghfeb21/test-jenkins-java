public class singleNumber {
    public int singleNumber(int[]arr){
        
        int t=0;

        for(int i=0;i<arr.length;i++){
            t ^= arr[i];//bitwise operator
        }

        return t;
    }
    public static void main(String[]args){
        int arr[]={1,1,2,2,3,3,4,4,5};

        System.out.println(new singleNumber().singleNumber(arr));

    }
}

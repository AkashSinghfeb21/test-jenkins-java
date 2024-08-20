import java.util.Arrays;
public class bubbleSort {
    public static int[] sort(int arr[]){
        int t = 0;

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    t=arr[i];
                    arr[i]=arr[j];
                    arr[j]=t;
                }
            }
        }

        return arr;
    }
    public static void main(String[]args){
       int arr[]={5,4,3,2,1};

       System.out.println(Arrays.toString(sort(arr)));
    }
}

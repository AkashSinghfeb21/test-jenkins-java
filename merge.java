import java.util.Arrays;
public class merge {
    public static void mergex(int a[],int s,int a1[],int s1){
      int i=s-1;
      int j=s1-1;
      int k = s+s1-1;

      while(i>=0 && j>=0){
        if(a[i]>a1[j]){
            a[k--]= a[i--];
        }else{
            a[k--]=a1[j--];
        }
      }

      while(j>=0){
        a[k--]=a1[j--];
      }
    }
    public static void main(String[]args){
        int arr[]={1,2,3,0,0,0};
        int arr1[] = {4,5,6};

        // int arrx[]=new int[arr.length+arr1.length];

        // for(int i=0;i<arr.length;i++){
        //    arrx[i]=arr[i];
        // }

        // for(int i=0;i<arr1.length;i++){
        //     arrx[arr1.length+i]= arr1[i];
        // }

        //System.out.println(Arrays.toString(arrx));

        mergex(arr, 3, arr1, arr1.length);

        System.out.println(Arrays.toString(arr));

        
    }
}

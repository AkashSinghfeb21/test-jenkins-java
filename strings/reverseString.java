import java.util.*;
public class reverseString {
    public void reverseString(char[] s) {
        // char []arr=new char[s.length];
        
        // for(int i=s.length-1;i>=0;i--){
        //     arr[s.length-1-i]=s[i];
        // }
        int left = 0;
        int right = s.length-1;

        while(left<right){
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            left++;
            right--;
        }

    }
    public static void main(String[]args){

        char []arr = {'r','k'};

        new reverseString().reverseString(arr);

        System.out.println(Arrays.toString(arr));


    }
}

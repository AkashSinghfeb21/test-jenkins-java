public class RevString2 {
    public String reverseStr(String s,int k){
        char[]arr = s.toCharArray();

        for(int i=0;i<arr.length;i+=2*k){
            int left = i;
            int right = Math.min(i+k-1,arr.length-1);

            while(left<right){
                char t = arr[left];
                arr[left]=arr[right];
                arr[right]=t;

                left++;
                right--;
            }
        }

        return new String(arr);
    }
    public static void main(String[]args){
      String a="abcdefg";

      System.out.println(new RevString2().reverseStr(a,2));
    }
}

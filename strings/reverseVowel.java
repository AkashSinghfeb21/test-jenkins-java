public class reverseVowel {
    public String reverseVowels(String s){
        char []arr = s.toCharArray();
        int left=0,right=s.length()-1;

        while(left<right){
            while(left<right && !isVowels(arr[left])){
                left++;
            }

            while(left<right && !isVowels(arr[right])){
                right--;
            }

            if(left<right){
                char t = arr[left];
                arr[left] = arr[right];
                arr[right] = t;

                left++;
                right--;
            }
        }

        return new String(arr);
    }
    
    public boolean isVowels(char c){
        return (c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||
        c=='U')?true:false;
    }
    public static void main(String[]args){
       String a="leetcode";

       System.out.println(new reverseVowel().reverseVowels(a));
    }
}

import java.util.Arrays;

public class anagram {
    public boolean isAnagram(String s,String t){
      char arr[] = s.toCharArray();
      char arr2[] = t.toCharArray();
      
      Arrays.sort(arr);
      Arrays.sort(arr2);

      return Arrays.equals(arr,arr2);
    } 
    public static void main(String[]args){
      String s = "wow";
      String t = "oww";
      
      System.out.println(new anagram().isAnagram(s, t));
      
    }
    
}

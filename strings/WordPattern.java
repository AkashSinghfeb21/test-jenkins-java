import java.util.Map;
import java.util.HashMap;
public class WordPattern {
    public static boolean wordPattern(String p,String s){
         Map<Character,String> mp = new HashMap<>();
         
         String arr[]=s.split(" ");

         if(arr.length!=p.length()){
            return false;
         }

         for(int i=0;i<p.length();i++){
            char ch = p.charAt(i);

            if(mp.containsKey(ch)){
                if(!mp.get(ch).equals(arr[i])){
                    return false;
                }
            }else{
                if(mp.containsValue(arr[i])){
                    return false;
                }
                mp.put(ch,arr[i]);
            }
         }
         return true;
    }
    public static void main(String[]args){
        String pattern = "abba";
        String s = "dog cat cat fish";
        System.out.println(wordPattern(pattern,s));
    }
}

public class validPalindrome {
    public static boolean isPalindrome(String s){
        // if(s.isEmpty()){
        //     return true;
        // }

        String sx = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        
        // String gg = "";

        if(sx.isEmpty()){
            return true;
        }

        // for(int i=sx.length()-1;i>=0;i--){
        //     gg+=sx.charAt(i);
        // }

        return sx.equals(new StringBuilder(sx).reverse().toString());

        // return(gg.equals(sx))?true:false;
    }
    public static void main(String[]args){
        String s = "A man, a plan, a canal: Panama";

        System.out.println(isPalindrome(s));
    }
}

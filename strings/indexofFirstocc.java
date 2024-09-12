public class indexofFirstocc {
    public static int strStr(String haystack,String needle){
        if(needle.isEmpty()){
            return 0;
        }

        return haystack.indexOf(needle);
    }
    public static void main(String[]args){
        String f = "fugle";
        String g = "fu";

        System.out.println(strStr(f, g));
    }
}

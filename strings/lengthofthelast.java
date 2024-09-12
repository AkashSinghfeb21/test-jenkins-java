public class lengthofthelast {
    public static int lastIndex(String g){
        g = g.trim();

        int x = g.lastIndexOf(' ');

        return g.length()-x-1;
    }
    public static void main(String[]args){
        String s = "Hello World";

        System.out.println(lastIndex(s));

        // int space = s.indexOf(' ');

        // System.out.println(s.subSequence(0, space));
    }
}

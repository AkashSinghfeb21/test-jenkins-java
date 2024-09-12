import java.util.Stack;
public class validParenthesis {
    public boolean isValid(String s){
        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            switch(s.charAt(i)){
                case '('->
                    st.push(')');
                case '{'->
                    st.push('}');
                case '['->
                    st.push(']');
                default->{
                    if(st.isEmpty()||st.pop()!=s.charAt(i)){
                        return false;
                    }
                }          
            }
        }

        return st.isEmpty();
    }
    public static void main(String[]args){
       String s = "{[)}";

       System.out.println(new validParenthesis().isValid(s));
    }
}

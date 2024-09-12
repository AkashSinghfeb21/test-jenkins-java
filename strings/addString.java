public class addString {
    public static String addStrings(String num1,String num2){
        String result ="";
        int carry=0;
        int i=num1.length()-1;
        int j=num2.length()-1;

        while(i>=0||j>=0||carry>0){
            int digit1=(i>=0)?num1.charAt(i)-'0':0; 
            int digit2=(j>=0)?num2.charAt(j)-'0':0;

            int sum =digit1+digit2+carry;

            carry = sum/10;
            result=(sum%10)+result;
            i--;
            j--;
        }

        return result;
    }
    public static void main(String[]args){

        String a="124",b="11";

        System.out.println(addStrings(a, b));

    }
}


import java.util.List;
import java.util.ArrayList;

public class FizzBuzzString {
    public List<String> fizzBuzz(int n){

        List<String> list= new ArrayList<>();

        int i=1;

        while(i<=n){
            if(i%3==0 && i%5==0){
                list.add("FizzBuzz");
            }else if(i%3==0){
                list.add("Fizz");
            }else if(i%5==0){
                list.add("Buzz");
            }else{
                list.add(String.valueOf(i));
            }

            i++;
        }

        return list;
         
    }
    public static void main(String[]args){

        System.out.println(new FizzBuzzString().fizzBuzz(10));

    }
}

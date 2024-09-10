import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
public class ThirdMax {
    public int thirdMax(int[] nums) {
        
        HashSet<Integer> set = new HashSet<>();

        for(int i:nums){
            set.add(i);
        }

        ArrayList<Integer> list = new ArrayList<>();

        for(int i:set){
            list.add(i);
        }

        Collections.sort(list,Collections.reverseOrder());

        if(list.size()<3){
            return list.get(0);
        }

        return list.get(2);
    }
    public static void main(String[]args){
        int arr[]={1,2,2};

        System.out.println(new ThirdMax().thirdMax(arr));
    }
}

public class plusOne {
    public int[] plusOnex(int[] digits) {
        //  if(digits.length>=2){
        //  int t = digits[digits.length-1]+1;

        //  digits[digits.length-1]=t;

        //  return digits;
        // }

        // digits[0] = 0;
        
        // int[] arr = new int[digits.length+1];
        
        // arr[0] = 1;

        // return arr;
        for (int i = digits.length - 1; i >= 0; i--) {
          if (digits[i] < 9) {
              digits[i]++;
              return digits;  // Return early if no carry-over occurs
          }
          digits[i] = 0;  // Set the current digit to 0 if it was 9
      }
      
      // If we exited the loop, all the digits were 9, so we need a larger array
      int[] newNumber = new int[digits.length + 1];
      newNumber[0] = 1;  // The new number starts with 1, and the rest are 0
      return newNumber;
    }
    public static void main(String[]args){
      int arr[]={9};

      new plusOne().plusOnex(arr);

      for(int i:arr){
        System.out.println(i);
      } 
    }
}

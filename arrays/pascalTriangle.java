import java.util.ArrayList;
import java.util.List;

public class pascalTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        if (numRows == 0) {
            return result;
        }

        // Add the first row with a single element '1'
        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        result.add(firstRow);

        // Generate subsequent rows
        for (int i = 1; i < numRows; i++) {
            List<Integer> prevRow = result.get(i - 1);
            List<Integer> currentRow = new ArrayList<>();
            currentRow.add(1); // First element of each row is '1'

            // Calculate middle elements of the row
            for (int j = 1; j < i; j++) {
                currentRow.add(prevRow.get(j - 1) + prevRow.get(j));
            }

            currentRow.add(1); // Last element of each row is '1'
            result.add(currentRow);
        }

        return result;
    }

    public static void main(String[] args) {
        pascalTriangle sol = new pascalTriangle();
        int numRows = 5;
        List<List<Integer>> triangle = sol.generate(numRows);

        for (List<Integer> row : triangle) {
            System.out.println(row);
        }
    }
}

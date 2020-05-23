package array;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle1 {

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<List<Integer>>();

        // Zero rows for zero numRows
        if (numRows == 0) {
            return triangle;
        }
        //add element to triangle and the value of first row will be [1]
        triangle.add(new ArrayList<Integer>());
        triangle.get(0).add(1);


        for (int i = 1; i < numRows; i++) {
            List<Integer> prevRow = triangle.get(i - 1);
            List<Integer> row = new ArrayList<>();

            row.add(1);
            for (int j = 1; j < i; j++) {
                row.add(prevRow.get(j - 1) + prevRow.get(j));
            }
            row.add(1);
            triangle.add(row);
        }
        return triangle;
    }
}

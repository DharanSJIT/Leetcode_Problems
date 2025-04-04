
import java.util.HashSet;

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        HashSet<Integer> set=new HashSet<>();
        for (int[] matrix1 : matrix) {
            for (int j = 0; j<matrix[0].length; j++) {
                set.add(matrix1[j]);
            }
        }
        
        return set.contains(target);
    }
}
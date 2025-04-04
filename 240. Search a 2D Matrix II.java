class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                set.add(matrix[i][j]);
            }
        }
        
        return set.contains(target);
    }
}
class Solution {
    public int[][] transpose(int[][] matrix) {
       
       int r=matrix.length;
       int c=matrix[0].length;
       int[][] arr=new int[c][r];
       for(int i=0;i<c;i++){
        for(int j=0;j<r;j++){
            arr[i][j]=matrix[j][i];
        }
       }
       return arr;
    }
}
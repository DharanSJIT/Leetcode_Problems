class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
       int n=grid.length;
       int n1=grid[0].length;
       int count=0;
       for(int i=1;i<=n*n1;i++){
          count+=i;
       } 
       int repeat=0;
       int count1=0;
       HashMap<Integer,Boolean> map=new HashMap<>();
       for(int i=0;i<grid.length;i++){
        for(int j=0;j<grid[0].length;j++){
            int num=grid[i][j];
           if(map.containsKey(num)){
                repeat=num;
           }
           else{
            map.put(num,true);
            count1+=num;
           }
        }
       }
       return new int[]{repeat,count-count1};
    }
}
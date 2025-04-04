class Solution {
    public int xorOperation(int n, int start) {
        int sum=0;
        int[] res=new int[n];
        for(int i=0;i<n;i++){
            res[i]=start+2*i;
            sum^=res[i];
            
        }
        return sum;
    }
}
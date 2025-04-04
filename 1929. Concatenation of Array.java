class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] n=new int[nums.length*2];
        int m=nums.length;
        System.arraycopy(nums,0,n,0,m);
        System.arraycopy(nums,0,n,m,m);
        return n;
    }
}
class Solution {
    public int smallestEqual(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int n=nums[i];
            int x=i;
            if(x%10 == n){
                return i;
            }
        }
        return -1;
    }
}
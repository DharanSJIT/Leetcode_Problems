class Solution {
    public int maximumCount(int[] nums) {
        int count=0;
        int count1=0;
        for(int i=0;i<nums.length;i++){
            int n=nums[i];
            if(n<0){
                count++;
            }
            else if(n>0){
                count1++;
            }
        }
        return Math.max(count,count1);
    }
}
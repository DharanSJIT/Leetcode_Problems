class Solution {
    public int missingNumber(int[] nums) {
        int count=0;
        int count1=0;
        for(int i=0;i<nums.length;i++){
            count+=nums[i];
        }
        for(int i=1;i<=nums.length;i++){
            count1+=i;
        }
        return count1-count;
    }
}
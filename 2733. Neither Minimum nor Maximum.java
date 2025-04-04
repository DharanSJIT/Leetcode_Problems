class Solution {
    public int findNonMinOrMax(int[] nums) {
        if(nums.length==2){
            return -1;
        }
        if(nums.length>2){
        Arrays.sort(nums);
        return nums[1];
        }
        return -1;
    }
}
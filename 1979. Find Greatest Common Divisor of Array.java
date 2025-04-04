class Solution {
    public int findGCD(int[] nums) {
       Arrays.sort(nums);
       int res=nums[0];
       int res1=nums[nums.length-1];
       while(res1!=0){
        int temp=res1;
        res1=res%res1;
        res=temp;
       }
       return res;
    }
}
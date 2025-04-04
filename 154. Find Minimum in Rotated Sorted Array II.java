class Solution {
    public int findMin(int[] nums) {
       //Arrays.sort(nums);
       //return nums[0];
       int min=nums[0];
       for(int i=0;i<nums.length;i++){
           if(nums[i]<min){
              min=nums[i];
           }
       } 
       return min;
    }
}
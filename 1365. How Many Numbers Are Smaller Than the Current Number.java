class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
      int n=nums.length;
      int[] nums1=new int[n];
      for(int i=0;i<n;i++){
        int count=0;
        for(int j=0;j<n;j++){
            if(nums[j]<nums[i]){
                count++;
            }
        }
          nums1[i]+=count;  
      }
      
      return nums1;
    }
}
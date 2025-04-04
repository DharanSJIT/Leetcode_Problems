class Solution {
    public int findNumbers(int[] nums) {
        int count=0,count1=0;
        for(int i=0;i<nums.length;i++){
            int n=nums[i];
            count=0;
              while(n!=0){
                int temp=n%10;
                count+=1;
                n/=10;
              }
             
              if(count%2==0){
                count1+=1;
              }
        }
        return count1;
    }
}
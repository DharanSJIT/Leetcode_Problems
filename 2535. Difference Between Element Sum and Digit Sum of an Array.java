class Solution {
    public int differenceOfSum(int[] nums) {
        int sum=0;
        int sum1=0;
        int sum2=0;
        int sum3=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        for(int i=0;i<nums.length;i++){
            int n=nums[i];
            
            if(n<10){
                sum1+=n;
            }
            else{
                while(n!=0){
                    int temp=n%10;
                    sum2+=temp;
                    n/=10;
                }
            }
          sum3=sum1+sum2;
        }
        return sum-sum3;
    }
}
class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int sum=0;
        int temp1=x;
        while(x!=0){
            int temp=x%10;
            sum+=temp;
            x/=10;
        }
        if(temp1%sum==0){
           return sum;
        }
        return -1;
    }
}
class Solution {
    public int subtractProductAndSum(int n) {
        int sum=0;
        int temp=n;
        while(n!=0){
            int x=n%10;
            sum+=x;
            n/=10;
        }
    
        int count=1;
        while(temp!=0){
            int x1=temp%10;
            count*=x1;
            temp/=10;
        }
        return count-sum;
    }
}
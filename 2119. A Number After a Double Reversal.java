class Solution {
    public boolean isSameAfterReversals(int num) {
        if(num==0){
            return true;
        }
        int res=0,res1=0;
        int t=num;
        while(num!=0){
            int temp=num%10;
            res=res*10+temp;
            num/=10;
        }
        while(res!=0){
            int temp1=res%10;
            res1=res1*10+temp1;
            res/=10;
        }
        return t==res1;
    }
}
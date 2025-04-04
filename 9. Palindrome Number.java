class Solution {
    public boolean isPalindrome(int x) {
     int temp=x;
     if(x<0){
        return false;
     }
     int sum=0;
     while(x!=0){
        int tem=x%10;
        sum=sum*10+tem;
        x/=10;
     }
     return sum==temp;
    }
}

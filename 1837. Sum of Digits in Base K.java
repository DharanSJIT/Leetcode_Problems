class Solution {
    public int sumBase(int n, int k) {
     int sum=0;
     while(n!=0){
        int x=n%k;
        sum+=x;
        n=n/k;
     }
     return sum;
    }
}
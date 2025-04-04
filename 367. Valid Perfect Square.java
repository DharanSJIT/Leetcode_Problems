class Solution {
    public boolean isPerfectSquare(int num) {
       double a=Math.sqrt(num);
       int b=(int)a;
       if(b*b==num){
        return true;
       }
       return false;
    }

}
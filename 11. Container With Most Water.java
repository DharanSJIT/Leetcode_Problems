class Solution {
    public int maxArea(int[] height) {
       int left=0;
       int right=height.length-1;
       int min=0,diff=0,maxwater=0;
       while(left<=right){
        min=Math.min(height[left],height[right]);
        diff=Math.abs(right-left);
        maxwater=Math.max(maxwater,min*diff);
        if(height[left]<=height[right]){
            left++;
        }
        else{
            right--;
        }
       } 
       return maxwater;
    }
}
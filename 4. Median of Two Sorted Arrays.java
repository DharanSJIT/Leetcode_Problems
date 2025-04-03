class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
     int n=nums1.length;
     int m=nums2.length;
     int[] res=new int[n+m];
     System.arraycopy(nums1,0,res,0,n);
     System.arraycopy(nums2,0,res,n,m);
     Arrays.sort(res);
     int b=res.length;
     if(b%2!=0){
        return res[b/2];
     }
     else{
        return (res[b/2-1]+res[b/2])/2.0;
     }
    }
}

class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
       HashSet<Integer> set=new HashSet<>();
       for(int i=0;i<nums1.length;i++){
        set.add(nums1[i]);
       }
       for(int j=0;j<nums2.length;j++){
        int num=nums2[j];
        if(set.contains(num)){
            return num;
        }
       }
       
       return -1;
    }
}
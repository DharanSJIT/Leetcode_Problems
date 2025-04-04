class Solution {
    public boolean search(int[] nums, int target) {
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        return set.contains(target);
    }
}
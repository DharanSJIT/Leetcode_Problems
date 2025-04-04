class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
      Set<Integer> set1=new HashSet<>();
      for(int num:nums) set1.add(num);

      List<Integer> res=new ArrayList<>();
      for(int i=1;i<=nums.length;i++){
        if(!set1.contains(i)){
            res.add(i);
        }
      }  
      return res;
    }
}
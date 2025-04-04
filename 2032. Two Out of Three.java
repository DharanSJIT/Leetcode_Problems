class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        Set<Integer> set1=new HashSet<>();
        Set<Integer> set2=new HashSet<>();
        Set<Integer> set3=new HashSet<>();
        for(int num: nums1) set1.add(num);
        for(int num: nums2) set2.add(num);
        for(int num: nums3) set3.add(num);

        Set<Integer> common12=new HashSet<>(set1);
        common12.retainAll(set2);
        Set<Integer> common13=new HashSet<>(set3);
        common13.retainAll(set1);
        Set<Integer> common23=new HashSet<>(set2);
        common23.retainAll(set3);

        Set<Integer> res=new HashSet<>();
        res.addAll(common12);
        res.addAll(common23);
        res.addAll(common13);
        return new ArrayList<>(res);
    }
}
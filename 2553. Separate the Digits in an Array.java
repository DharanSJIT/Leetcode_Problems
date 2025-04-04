class Solution {
    public int[] separateDigits(int[] nums) {
        ArrayList<Integer> res=new ArrayList<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
             ArrayList<Integer> templist=new ArrayList<>();
            int m=nums[i];
            while(m!=0){
                int temp=m%10;
                templist.add(temp);
                m/=10;
            }
            Collections.reverse(templist);
            res.addAll(templist);
        }
        int[] arr=new int[res.size()];
        for(int i=0;i<res.size();i++){
            arr[i]=res.get(i);
        }
        return arr;
    }
}
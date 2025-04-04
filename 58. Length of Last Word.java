class Solution {
    public int lengthOfLastWord(String s) {
        
        s=s.trim();
        int lastindex=s.lastIndexOf(" ");
        if(lastindex==-1){
            return s.length();
        }
        else{
            return s.length()-lastindex-1;
        }
    }
}
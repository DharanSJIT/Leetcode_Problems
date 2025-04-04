class Solution {
    public boolean isAcronym(List<String> words, String s) {
        int len=s.length();
        if(words.size()!=len){
            return false;
        }
       for(int i=0;i<words.size();i++){
        char firstchar=words.get(i).charAt(0);
        if(firstchar!=s.charAt(i)){
            return false;
        }
       }
       return true;
    }
}
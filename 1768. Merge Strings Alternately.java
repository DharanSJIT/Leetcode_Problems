class Solution {
    public String mergeAlternately(String word1, String word2) {
        int n=word1.length();
        int m=word2.length();
        int i=0;
        int j=0;
        StringBuilder res=new StringBuilder();   // using stringbuilder to reduce time complexity
        while(i<n && j<m){
            res.append(word1.charAt(i));
            res.append(word2.charAt(j));
            i++;
            j++;
        }
        while(i<n){
            res.append(word1.charAt(i++));
        }
        while(j<m){
            res.append(word2.charAt(j++));
        }
        return res.toString();
        //String res="";
        //while(i<n && j<m){
            //res+=word1.charAt(i);
            //res+=word2.charAt(j);
            //i++;
            //j++;
        //}                                          7ms
        //while(i<n){
            //res+=word1.charAt(i++);
        //}
        //while(j<m){
            //res+=word2.charAt(j++);
        //}
        //return res;
    }
}
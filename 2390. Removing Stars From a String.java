class Solution {
    public String removeStars(String s) {
       Stack<Character> stack=new Stack<>();
       StringBuilder sb=new StringBuilder();
       for(int i=0;i<s.length();i++){
        if(s.charAt(i)!='*'){
            stack.push(s.charAt(i));
        }
        else{
            if(!stack.isEmpty()){
                stack.pop();
            }
            
        }
       }
       while(!stack.isEmpty()){
        sb.append(stack.pop());
       } 
       return sb.reverse().toString();
    }
}
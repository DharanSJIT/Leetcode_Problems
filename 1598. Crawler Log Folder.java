class Solution {
    public int minOperations(String[] logs) {
        Stack<String> st=new Stack<>();
        int count=0;
        for(int i=0;i<logs.length;i++){
            if(logs[i].equals("../")){
                if(!st.isEmpty()){
                    st.pop();
                }
            }
            else if(logs[i].equals("./")){
                continue;
            }
            else{
                st.push(logs[i]);
            }

            //or

            // if(logs[i].equals("./")){
            //     continue;
            // }
            // else if(logs[i].equals("../")){
            //     if(!st.isEmpty()){
            //         st.pop();
            //     }
            // }
            // else if(logs[i].charAt(0) != '.'){
            //     st.push(logs[i]);
            // }
            
        }
        
        return st.size();
    }
}
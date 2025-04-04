class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st=new Stack<>();
        int t=0;
        int ans=0;
       
        int ans1=0;
        for(int i=0;i<operations.length;i++){
            
            if(operations[i].equals("+")){
                if(!st.isEmpty()){
                   t=st.pop();
                   ans=t+st.peek();
                }
                st.push(t);
                st.push(ans);
            }

            else if(operations[i].equals("D")){
                if(!st.isEmpty()){
                    int t2=st.peek();
                   
                    st.push(t2*2);
                    
                }
            }

            else if(operations[i].equals("C")){
                if(!st.empty()){
                    st.pop();
                }
            }
            
            else{
                st.push(Integer.parseInt(operations[i]));
               
            }

        }

        while(!st.isEmpty()){
            ans1+=st.pop();
        }
        return ans1;
    }
}
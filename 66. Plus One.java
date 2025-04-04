class Solution {
    public int[] plusOne(int[] digits) {
       int n=digits.length;

      int[] a=new int[digits.length];
     
      for(int i=0;i<n;i++){
        if(n==1){
            a[i]=(digits[i]+1);
            int n1=a[i];
            int count=0;
            while(n1>9){
                int temp=n1%10;
                count++;
                n1/=10;
            }
            for(int i=0;)

        }
        if(n>1){
        if(i==n-1){
            a[i]+=digits[i]+1;
        }
        else{
            a[i]+=digits[i];
        }
        }
      }
      
      return a;
    }
}

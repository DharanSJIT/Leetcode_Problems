class Solution {
    public int addDigits(int num) {
        if(num==0){
            return num;
        }
        int temp=0;
        while(num!=0){
            int last=num%10;
            temp+=last;
            num/=10;
        }
        int count=0;
        while(temp!=0){
            int last1=temp%10;
            count+=last1;
            temp/=10;
        }
        if(count<10){
            return count;
        }
        else{
            int count1=0;
            while(count!=0){
                int last2=count%10;
                count1+=last2;
                count/=10;
            }
            return count1;
        }
        
    }
}
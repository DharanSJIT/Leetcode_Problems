class Solution {
    public int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
        int temp=arrivalTime+delayedTime;
        if(temp==24){
            return 0;
        }
        else if(temp>24){
            return temp-24;
        }
        else{
            return temp;
        }
    }
}
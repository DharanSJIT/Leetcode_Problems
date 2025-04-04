class Solution {
    public double[] convertTemperature(double celsius) {
       double kel=celsius+273.15;
       double fah=celsius*1.80+32.0;
       double[] res=new double[2];
       res[0]=kel;
       res[1]=fah;
       return res;
       //return new double[]{kel,fah};
    }
}
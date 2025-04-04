class Solution {
    public String convertDateToBinary(String date) {
        String[] res=date.split("-");
        int year=Integer.parseInt(res[0]);
        int month=Integer.parseInt(res[1]);
        int date1=Integer.parseInt(res[2]);

        String year1=Integer.toBinaryString(year);
        String month1=Integer.toBinaryString(month);
        String date2=Integer.toBinaryString(date1);

        return year1+"-"+month1+"-"+date2;
    }
}
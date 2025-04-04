class Solution {
    public int differenceOfSums(int n, int m) {
        int count = 0;
        // First loop
        for (int i = 1; i <= n; i++) {
            if (i % m == 0) {
                count += i;
            }
        }

        int count1 = 0;
        // Second loop
        for (int i = 0; i <=n; i++) {
            count1 += i; 
        }


        int a = count1 - count;
        int b = a-count;
        return b;
    }

}

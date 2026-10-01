class Solution {
    public int preimageSizeFZF(int n) {
     long low = 0;
        long high = 5L * (n+1);//5L is a long
        
        while (low < high) {
            long mid = low + (high - low) / 2;
            
            long count = 0;//stor kaega moid m kitne trailing zero h
            long x = mid;//calculate kaega mid m kitne zero h

            while (x > 0) {//count trailing xeros
              x = x / 5;//5 keh multiples ko count
                count = count + x;//harr division k baad value mili usko add krdo 
            }
             if (count == n) {
                return 5;
            }
            // mid! has at least n trailing zeroes
           else if (count >= n) {
                high = mid-1;
            }
            // mid! has fewer than n zeroes count n seh chot ah
            else {
                low = mid + 1;
            }
        }
        return 0;//ager nhi mita
    }
}
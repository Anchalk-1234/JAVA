
     
class Solution {
    public int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1) {//overflow handel
            return Integer.MAX_VALUE;
        }

        long a = Math.abs((long) dividend);//convrt both no to pos
        long b = Math.abs((long) divisor);
        int ans = 0;//quatient

        for (int i = 31; i >= 0; i--) {//bits chec kki 31 to0
            if ((a >> i) >= b) {//check multiply fit
                a -= (b << i);//subtract multiple
                ans += (1 << i);//add qutient
            }
        }

        if ((dividend < 0) ^ (divisor < 0)) {//handel negative val
            ans = -ans;
        }

        return ans;
    }
}

    

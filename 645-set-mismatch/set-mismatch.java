class Solution {
    public int[] findErrorNums(int[] arr) {
        int n = arr.length;
            int repeating = -1;
            int missing = -1;
            
              for(int i = 0; i<n; i++) {
                int num = Math.abs(arr[i]);//sab ko-ve mark akre

              // Find repeating and missing number
           if(arr[num-1] < 0)//ise phle -ve kiya gya h so we find repating
                repeating = num;
                else
                arr[num-1] *= (-1);//we make -ve
                   }

                   for(int i = 0; i<n; i++) {
                       if(arr[i] > 0) {//jo b +ve hai usko+1 kiya
                           missing = i+1;
                           break;
                       }
                   }

            return new int[]{repeating, missing};
    }
}
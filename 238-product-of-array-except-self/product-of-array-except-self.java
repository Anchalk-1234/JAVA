class Solution {
    public int[] productExceptSelf(int[] arr) {
          // Array to store all left multiplication
           int[] left = new int[arr.length];

           // Array to store all right multiplication
           int[] right = new int[arr.length];

           left[0] = 1;
           for (int i = 1; i < arr.length; i++) {//srt trverse orignal 1 seh kiya
             left[i] = left[i - 1] * arr[i - 1];//fill all elmt in left then right
           }

           right[arr.length - 1] = 1;
           for (int i = arr.length - 2; i > -1; i--) {//second last s chlu kiya
             right[i] = right[i + 1] * arr[i + 1];
           }

           int[] ans = new int[arr.length];
           for (int i = 0; i < arr.length; i++) {
             ans[i] = left[i] * right[i];//multiply both
           }

           return ans;
        
    }
}
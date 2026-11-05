class Solution {
    public int findLengthOfShortestSubarray(int[] arr) {
        int n = arr.length;
        // Find the jth pointer from right side
        int j = n-1;
        while(j > 0 && arr[j] >= arr[j-1]) {
            j--;
        }
        int i = 0;
        int result = j; //we are removing all elements left to index j  becasue index j to n-1 are sorted
        
        //correct i and j find kiya find deleted elements = j - i - 1
        while(i < j && (i == 0 || arr[i] >= arr[i-1])) { //increasing ordere of elements from i

            while(j < n && arr[i] > arr[j]) {//i>=j
                j++;
            }

            //correct jth element finf hogya such that i<=j
            result = Math.min(result, j - i - 1);
            i++;
        }

        return result; 
    }
}
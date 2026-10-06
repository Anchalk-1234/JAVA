class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] freq = new int[1001];//create freq arr

        for (int num : arr1) {//Count elements of arr1
            freq[num]++;
        }
        int index = 0;//batyega arr1 kis posi par next elmt put karna h
        
        for (int num : arr2) {// follow arr2 order
            while (freq[num] > 0) {//jiska b freq xzero seh nhdhoi h 
                arr1[index++] = num;
                freq[num]--;
            }
        }
        // Put remaining elements in increasing order
        for (int num = 0; num <= 1000; num++) {
            while (freq[num] > 0) {
                arr1[index++] = num;//ager remaing multiple times aya toh 
                freq[num]--;
            }
        }
        return arr1;
    }
}
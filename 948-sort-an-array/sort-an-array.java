class Solution {
    public int[] sortArray(int[] nums) {
        mergeSort(nums, 0, nums.length - 1);//sort arr
        return nums;
    }
    void mergeSort(int[] arr, int low, int high) {
        if (low >= high)
            return;

        int mid = low + (high - low) / 2;//divide arr

        mergeSort(arr, low, mid);//sort left half
        mergeSort(arr, mid + 1, high);//sort right half
         merge(arr, low, mid, high);//now merge both
    }
    
    //merge by three pointer approch
    void merge(int[] arr, int low, int mid, int high) {
        int[] temp = new int[high - low + 1];
        int i = low;
        int j = mid + 1;
        int k=0;//temp arr
        while (i <= mid && j <= high) {
            if (arr[i] <= arr[j]) {
                temp[k] = arr[i];//arr i store hya temp m
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        while (i <= mid) {//copy remaing left emnts aGER bch geh
            temp[k] = arr[i];
            i++;
            k++;
        }
        while (j <= high) {//same as right
            temp[k] = arr[j];
            j++;
            k++;
        }
        for (int x = 0; x < temp.length; x++) {//temp k value orignal arr m copy
            arr[low + x] = temp[x];
        }
    }
}
class Solution {
    public int search(int[] arr, int key) {
        int left = 0;
         int right = arr.length - 1;
         return modifiedBinarySearch(arr, key, left, right); //srch func
        
    }
     
    int modifiedBinarySearch(int[] arr, int key, int left, int right) {
      if (left > right)
           return -1;

         // Avoid overflow, same as (left + right)/2
         int mid = left + ((right - left) / 2);
         if (arr[mid] == key)
           return mid; // Found

         // If left half is sorted if first is smaller than last emlt that means its sorted
         if (arr[mid] >= arr[left]) {

           // If key is in left half
           if (arr[left] <= key && key <= arr[mid])
             return modifiedBinarySearch(arr, key, left, mid - 1);
           else
             return modifiedBinarySearch(arr, key, mid + 1, right);

         } else {
         
           // If key is in right half. If right half is sorted
           if (arr[mid] <= key && key <= arr[right])
             return modifiedBinarySearch(arr, key, mid + 1, right);
           else
             return modifiedBinarySearch(arr, key, left, mid - 1);
        }
    }
}
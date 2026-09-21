class Solution {
    public int[] searchRange(int[] arr, int x) {
           
    int left = findLeftBound(arr, x);
    int right = findRightBound(arr, x);
   return new int[]{left, right};
    }
     private int findLeftBound(int[] arr, int x) {
    int index = -1, low = 0, high = arr.length - 1;

    // Standard binary search
    while (low <= high) {
      int mid = low + (high - low) / 2;

      if (arr[mid] == x) {
        index = mid;//store 
        high = mid - 1; // Look in the left sub-array
      }
      else if (arr[mid] < x)
        low = mid + 1;
      else
        high = mid - 1;
    }

    return index;
  }

  private int findRightBound(int[] arr, int x) {
    int index = -1, low = 0, high = arr.length - 1;

    // Standard binary search
    while (low <= high) {
      int mid = low + (high - low) / 2;

      if (arr[mid] == x) {
        index = mid;
        low = mid + 1; // Look in the right sub-array
      }
      else if (arr[mid] < x)
        low = mid + 1;
      else
        high = mid - 1;
    }

    return index;
  
}

}
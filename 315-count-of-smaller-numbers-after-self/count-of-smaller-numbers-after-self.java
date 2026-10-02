class Solution {
    int[] count;//indx i ke elmt ka na ssrtoe hoga
    int[] temp;//merge sort k time sorted order temp store karne 

    public List<Integer> countSmaller(int[] nums) {
    int n = nums.length;

        count = new int[n];//arr ko initialize with 0
        temp = new int[n];

        int[][] arr = new int[n][2];

        //harr indx k sath usla rignal indx b store hoga
        for (int i = 0; i < n; i++) {
            arr[i][0] = nums[i];
            arr[i][1] = i;
        }

        mergeSort(arr, 0, n - 1);
        List<Integer> result = new ArrayList<>();
        for (int x : count) {
            result.add(x);
        }
        return result;
    }

    void mergeSort(int[][] arr, int left, int right) {
        if (left >= right) {
            return;
        }
        int mid = (left + right) / 2;
        mergeSort(arr, left, mid);//phle left ka sort thne right l leye call
        mergeSort(arr, mid + 1, right);
        merge(arr, left, mid, right);
    }

    void merge(int[][] arr, int left, int mid, int right) {
        int i = left;//left sorted half ka ponter
        int j = mid + 1;
        int k = left;//temp mein position

        while (i <= mid && j <= right) {
            if (arr[i][0] <= arr[j][0]) {//jab tak dono m elmt hai
                count[arr[i][1]] += j - mid - 1;//Left elent se smller kitne right-side elts mil chuke hain
                temp[k++] = i;
                i++;
            } else {
                temp[k++] = j;//right smaller h
                j++;
            }
        }//remaing k leye
        while (i <= mid) {
            count[arr[i][1]] += j - mid - 1;
            temp[k++] = i;
            i++;
        }
        while (j <= right) {
            temp[k++] = j;
            j++;
        }
        // Copy sorted elements
        int[][] copy = new int[right - left + 1][2];//temp arr bano
        for (int x = left; x <= right; x++) {
            copy[x - left] = arr[temp[x]];
        }
        for (int x = 0; x < copy.length; x++) {
            arr[left + x] = copy[x];//copy back in arr
    }
}
}
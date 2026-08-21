class Solution {
public int getMaxArea(int[] arr){

    int n = arr.length;//no of bars
    Stack<Integer> s = new Stack<>();//s store index
    int res = 0;//max area found
    int tp ,curr;

    for (int i = 0; i < n; i++) {

        while (!s.isEmpty()
               && arr[s.peek()] >= arr[i]) {
            tp = s.pop();//histogram ka smallest elmt pop
            int width= s.isEmpty() ? i : i - s.peek() - 1;//now jo elmt pop hua tha uska prev smaller stack ka curr top yah ne xt smaller elmt is i

            res = Math.max(res, arr[tp] * width);
        }
        s.push(i);
    }

    while (!s.isEmpty()) {//remaining k leye next smller not exist prev samller just below stack

        tp = s.pop();
        curr = arr[tp] * (s.isEmpty() ? n : n - s.peek() - 1);
        res = Math.max(res, curr);
    }

    return res;
}

// Funtion to fd the maxi area of rect
// in a 2D matix. 
public int maximalRectangle(char[][] mat) {
    

    int n = mat.length, m = mat[0].length;

    int[] arr = new int[m];//arr to store as a hostogrm

    int res = 0;

    // Traverse row by row.
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
            if (mat[i][j] == '1') {
                arr[j]++;//height at j is++
            }
            else {
                arr[j] = 0;
            }
        }

        res = Math.max(res, getMaxArea(arr));
    }

    return res;
}
}

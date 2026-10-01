class Solution {
    public int shipWithinDays(int[] weights, int days) {
    int minCap = 0;
    int maxCap = 0;

    for (int weight : weights) {//find max weight and sum of all it will be high low
      minCap = Math.max(minCap, weight);
      maxCap += weight;
    }
    while (minCap < maxCap) {//binary srch
      int mid = minCap + (maxCap - minCap) / 2;

      int useddays = 1;//mid ko check kitaaa
      int sum = 0;
      for (int weight : weights) {
        if (sum + weight > mid) {//ager capacity seh badha toh dayds inc hoga
          useddays++;
          sum = 0;
        }
        sum += weight;
      }

     //capacity kam h(required days alowwed days s jayasda h cap++)
       if (useddays > days){
        minCap = mid + 1;
       }
      else{//capacity enough
        maxCap = mid;
    }

   
    }
     return minCap; 
}
}
class Solution {
    public int findKthLargest(int[] nums, int k) {
        //create max heap as humko largest chyeh so hum normal ordering ko reverse krdengeh
        PriorityQueue<Integer> pq=   new PriorityQueue<>(Collections.reverseOrder());
        for (int num : nums) {//add every no in heap
            pq.add(num);
        }
        for (int i = 1; i < k; i++) {
            pq.poll();//largest s reompove kiya
        }

        return pq.peek();
    }
}
//nlogn [o(n)]

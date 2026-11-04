class Solution {
    public int maxEvents(int[][] events) {
        int n = events.length;
        
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        Arrays.sort(events, (a, b) -> Integer.compare(a[0], b[0]));//sort acc tosrting point 
        int day = events[0][0];
        int i = 0;//track every event jo ittratae ua h
        int count = 0; // number of events attended

        while(!pq.isEmpty() || i < n) {
            if(pq.isEmpty()) {
                day = events[i][0];//ager koi event available nh i h toh jumo drictly to next event srt day
            }
            while(i < n && events[i][0] == day) {//push in ;priorityv que
                pq.add(events[i][1]);
                i++;
            }
            if(!pq.isEmpty()) {
                pq.poll(); // Attend an event on this day
                count++; // Counting the result
            }
            day++;
            // Skip events whose end day is less than the current day (remove expire day ad day=2 pq92 3 4  ) skip 2
            while(!pq.isEmpty() && pq.peek() < day) {
                pq.poll();
            }
        }
        return count; 
    }
}
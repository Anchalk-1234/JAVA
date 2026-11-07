class Solution {
    public int[] getOrder(int[][] tasks) {

        int n = tasks.length;
        int[][] sortedTasks = new int[n][3];//malke vector jisme 3 cheje store hogi srt time precess time or indx

        for (int i = 0; i < n; i++) {
            int startTime = tasks[i][0];
            int processingTime = tasks[i][1];

            sortedTasks[i][0] = startTime;
            sortedTasks[i][1] = processingTime;
            sortedTasks[i][2] = i;
        }
        //sort acc to srt time
        Arrays.sort(sortedTasks, (a, b) ->Integer.compare(a[0], b[0]));

        int[] result = new int[n];//result stor hoga
        long currTime = 0;
        int idx = 0;
        int k = 0;//indx of result arr

        // Min heap:processing time, original index
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> {
            if (a[0] != b[0]) {
                return Integer.compare(a[0], b[0]);//ager processing time diff h toh smalelr time ko more pririty
            }
            return Integer.compare(a[1], b[1]);
        });

        while (idx < n|| !pq.isEmpty()) {
            if (pq.isEmpty() && currTime < sortedTasks[idx][0]) {//curr time h woh less h sabse phle task s
                currTime = sortedTasks[idx][0];
            }
//joh b h curr time joh task use phle ya equal tak  akte h usko daa loh
            while (idx < n && sortedTasks[idx][0] <= currTime) {
                pq.offer(new int[]{
                    sortedTasks[idx][1],//push processing time amnd idx 
                    sortedTasks[idx][2]
                });
                idx++;
            }

            int[] currTask = pq.poll();//now pop 
            currTime += currTask[0];//ab time + hoga processing time
            result[k++] = currTask[1];//or idx b daal deya result m
        }
        return result;
    }
}
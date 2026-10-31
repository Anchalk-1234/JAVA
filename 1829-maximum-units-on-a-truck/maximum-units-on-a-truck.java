class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes, (a, b) -> Integer.compare(b[1], a[1]));//sort by units in dec order
        int total = 0;//ttl unit jo load hogi tuck m

        for (int i = 0; i < boxTypes.length; i++) {//sare box p loop
            int boxes = Math.min(boxTypes[i][0], truckSize);//calculate kitna lejaskte h
            total += boxes * boxTypes[i][1];
            truckSize -= boxes;//kitni or bach i h
            if (truckSize == 0) {
                break;
            }
        }
        return total;
    }
}
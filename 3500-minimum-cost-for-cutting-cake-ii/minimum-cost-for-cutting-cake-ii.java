class Solution {
    public long minimumCost(int m, int n, int[] horizontalCut, int[] verticalCut) {
        int x = horizontalCut.length;
        int y = verticalCut.length;
        
        Arrays.sort(horizontalCut); // Sort in ascending order and iterate from right to left to process larger cost first
        Arrays.sort(verticalCut);   // Sort in ascending order and iterate from right to left to process larger cost first

        int i = x - 1, j = y - 1; //i j largest  hori  or vertical cut ko  point kare h

        long horizontalPieces = 1, verticalPieces = 1;//abi tak koi cut nhi h intially 1 h

        long result = 0;

        while (i >= 0 && j >= 0) {//jab tak dono m h
            if (horizontalCut[i] >= verticalCut[j]) {//horizonatl badha h
                result +=(long) horizontalCut[i] * verticalPieces;
                horizontalPieces++;
                i--;//ass m sort h es leye -- kioya h 
            } else {
                result +=(long) verticalCut[j] * horizontalPieces;
                verticalPieces++;
                j--;
            }
        }

        while (i >= 0) {//chek i j bacha to nhi h
            result += (long)horizontalCut[i] * verticalPieces;
            horizontalPieces++;
            i--;
        }

        while (j >= 0) {
            result +=(long) verticalCut[j] * horizontalPieces;
            verticalPieces++;
            j--;
        }

        return result;
    }
}
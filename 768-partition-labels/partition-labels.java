class Solution {
    public List<Integer> partitionLabels(String str) {
    List<Integer> partitions = new ArrayList<>();//store resilt

    for (int i = 0; i < str.length();) {

      // Get first and last index of first character
      int startIndex = i;
      int endIndex = str.lastIndexOf(str.charAt(startIndex));

      for (int s = startIndex + 1; s <= endIndex - 1; s++) {//look evy char inside partiom
       
        int lastIndexOfNextChar = str.lastIndexOf(str.charAt(s));//find last indx of char indide partioning

        if (lastIndexOfNextChar > endIndex) {//if last indx is grater than curr indx update
          endIndex = lastIndexOfNextChar;
        }
      }

      partitions.add(endIndex - startIndex + 1);//calculate partin size +1 becs indx srts 0
      i = endIndex + 1;//move to nect partioning
    }

    return partitions;
    }
}
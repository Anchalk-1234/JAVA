class Solution {
    public boolean rotateString(String s, String goal) {
      if (s == null || goal == null) {
         return false;
          }
         if (s.length() != goal.length()) {
            return false;
            }
        String rotated = s + s;//we concatinate 
       
        return rotated.contains(goal);
    }
    
}
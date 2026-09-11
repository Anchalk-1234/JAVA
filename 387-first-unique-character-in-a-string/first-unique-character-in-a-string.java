class Solution {
    public int firstUniqChar(String s) {
      int[] freq= new int[26];
      char[] chars = s.toCharArray();//update frq covert string to char
      for(char c:chars){
        freq[c-'a']++;//freq cout inc as asi value sind mil jaye ga

      } 
      for(int i=0;i<s.length();i++){
          if (freq[s.charAt(i) - 'a'] == 1) {   //freq check                  
            return i;
        }
    }  
    return -1;    //no uniq charf         
    }
}
class Solution {
    static String longestPalindrome(String s) {
       if(s.length()<=1)
       return s;
       
       String LPS="";//stroe result
       
       for(int i=1;i<s.length(); i++){//keep track of longest
           //keep tracxk of lest and right most pos odd length as low left m jaye ga opr high right m
           int low=i;
           int high=i;
           while(s.charAt(low)==s.charAt(high)){
               low--;
               high++;
               if(low==-1|| high==s.length())
               break;
           }
           
           String palindrome=s.substring(low+1,high);
           if(palindrome.length()>LPS.length()){
               LPS=palindrome;
           }
           //even length
         low=i-1;
          high=i;
           while(s.charAt(low)==s.charAt(high)){
               low--;
               high++;
               if(low==-1|| high==s.length())
               break;
           }
           
            palindrome=s.substring(low+1,high);
           if(palindrome.length()>LPS.length()){
               LPS=palindrome;
           }
       }
        return LPS;
    }
}

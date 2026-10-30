class Solution {
    public char findTheDifference(String s, String t) {
        int total=0;//s=orignal str ; t=m ek add hua h (totakl store aski  values)
     for(int i=0;i<t.length();i++){
        total=total+t.charAt(i);//total of char aski
     }   
     for(int i=0;i<s.length();i++){
        total=total-s.charAt(i);//total kiya s ka or -kardeya pure total s j ot ka tha
     }
     return (char)total;
    }
}
class Solution {
    public int myAtoi(String s) {
       //ignore sleding white spces and emty hui toh 0 return
       s=s.trim();
       long num=0;
       if(s.isEmpty()){
        return 0;
       } 
       //signed nesss(ager - hia toh -1 + hai to +1)
       int i=0;
       int sign=1;
       int n=s.length();
       if(s.charAt(i)=='-' ||s.charAt(i)=='+' ){
        sign=(s.charAt(i)=='-')?-1:1;
        i++;
       }
       //conversion char to int
       while(i<n && Character.isDigit(s.charAt(i))){
        num=num*10+(s.charAt(i)-'0');
        if(num*sign > Integer.MAX_VALUE){
            return Integer.MAX_VALUE;
        }
         if(num*sign < Integer.MIN_VALUE){
            return Integer.MIN_VALUE;
        }
        i++;
       }
       return (int)(sign*num);
    }
}
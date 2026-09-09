class Solution {
    public int minOperations(String s) {
        int c1=0;//jithna flip nedded h
        int c2=0;
        for(int i=0;i<s.length();i++){
            
            if(i % 2 == 0 && s.charAt(i)=='1') c1++;//even idx hai 0 ana chyeh
            if(i%2==1 && s.charAt(i)=='0') c1++;//odd indx ha i 1 if 0 flip it
            if(i%2==0 && s.charAt(i)=='0') c2++;//even m 1 hona chyeh 0 hai to flip
             if(i%2==1 && s.charAt(i)=='1') c2++;//odd m 0 
        }
        return Math.min(c1,c2);
    }
}
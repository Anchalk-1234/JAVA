class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        char ans=letters[0];//initially ans ko firrst letter man re
        int l=0;int h= letters.length-1;
        if(letters[h]<=target){//ager last char target s choy ah toh pora arr char target seh greater nhi hoskta
            return ans;
        }
        while(l<=h){
            int mid=(l+h)/2;
            char ch=letters[mid];//char karwana hai ese leye 
            if(ch>target){
                ans=ch;
                h=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return ans;
    }
}
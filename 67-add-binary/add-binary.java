class Solution {
    public String addBinary(String a, String b) {
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;
        
        StringBuilder ans = new StringBuilder();
        while (i >= 0 || j >= 0 || carry > 0) { 
            int sum = carry;//srt with carry
            if (i >= 0) {
                sum += a.charAt(i) - '0';//a digit add kro then b digit add kro
                i--;
            }
            if (j >= 0) {
                sum += b.charAt(j) - '0';
                j--;
            }
             ans.append(sum % 2);//in binary digit add will b 0 1 //// 2%2=0
            carry = sum / 2;//meANS DIvidsion
        }
        return ans.reverse().toString();
    }
}
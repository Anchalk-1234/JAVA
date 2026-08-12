class Solution {
    public String longestCommonPrefix(String[] strs) {
         if (strs == null || strs.length == 0) {
            return "";
        }

        String first = strs[0];//first string ko store karna h

        for (int i = 0; i < first.length(); i++) {//first string ko transversew

            char ch = first.charAt(i);//currnt chr ko stor e karwaya

            for (int j = 1; j < strs.length; j++) {//comare kro dusre string s

                if (i == strs[j].length() || strs[j].charAt(i) != ch) {
                    return first.substring(0, i);//first = "flower"; i = 2  ;;substring(0,2) return fl
                }
            }
        }

        return first;
    }
}
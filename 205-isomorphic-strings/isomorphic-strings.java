class Solution {
    public boolean isIsomorphic(String s1, String s2) {
      if (s1.length() != s2.length()) {//length check
            return false;
        }
        Map<Character, Character> map = new HashMap<>();
        for (int i = 0; i < s1.length(); i++) {
            char original = s1.charAt(i);
            char replacement = s2.charAt(i);

            // If original already has a mapping meh hai
            if (map.containsKey(original)) {//b a d
                if (map.get(original) != replacement) {// k i  k(k is prsnt so return false check  replacment  is alredy used h p=t t is not used
                    return false;//jo mapping hua h woh curr replcemnt k equal h
                }
            } 
            else {

                // ky y replcement kisis or ko deya h
                if (map.containsValue(replacement)) {
                    return false;
                }

                map.put(original, replacement);//hash map k ander key value pair store karna
            }
        }
        return true;
   }
}  

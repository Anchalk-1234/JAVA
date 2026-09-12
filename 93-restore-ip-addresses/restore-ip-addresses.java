class Solution {
    public List<String> restoreIpAddresses(String s) {
   
  ArrayList<String> ans = new ArrayList<>();//create ans list
     backtrack(s, 0, "", 0, ans);//s orignal s;0= srting idx;"" ip cuppriny empty;0=parts created so far;ans listy
     return ans;
    }

            void backtrack(String s, int index, String ip, int parts, ArrayList<String> ans) {
                // We have made 4 parts base3 case
                if (parts == 4) {
                    // All digits must be used
                    if (index == s.length()) {//we used all digits so we substring(1)= bexuse wehaev > at bogniong
                        ans.add(ip.substring(1));
                    }
                    return;
                }

                // Try 1, 2 and 3 digits
                for (int len = 1; len <= 3; len++) {
                    if (index + len > s.length()) {
                        break;
                    }

                    String part = s.substring(index, index + len);

                    // Leading zero not allowed
                    if (part.length() > 1 && part.charAt(0) == '0') {//srting m 0 not aloowed
                        break;
                    }

                    // Must be <= 255
                    if (Integer.parseInt(part) > 255) {
                        break;
                    }

                    // Backtrack
                    backtrack( s, index + len, ip + "." + part, parts + 1,ans
                    );
                }
            }
        }
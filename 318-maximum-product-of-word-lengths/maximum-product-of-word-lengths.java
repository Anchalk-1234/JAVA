class Solution {
    public int maxProduct(String[] words) {
        int n = words.length;
        int[] mask = new int[n];//haar word k leeter ka bit mask store k leye
        int max = 0;//max preoduct store 

        for (int i = 0; i < n; i++) {//hjar wpord p loop chlra
            for (char ch : words[i].toCharArray()) {//curr word k char ko ek ek kare
                mask[i] |= 1 << (ch - 'a');//exsting bit mask m add
            }
        }

        for (int i = 0; i < n; i++) {//1 word select
            for (int j = i + 1; j < n; j++) {//2 word selct
                if ((mask[i] & mask[j]) == 0) {//common letter check
                    max = Math.max(max,words[i].length() * words[j].length());
                }
            }
        }
        return max;
    }
} 

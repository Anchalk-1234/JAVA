class Solution {
    public List<Integer> findAnagrams(String s, String p) {

    int[] pCount = new int[26];//stor  ch count of p
    int[] sCount = new int[26];//and store count of window in s
    List<Integer> result = new java.util.ArrayList<>();

    // Count frequency of characters in p
    for (char c : p.toCharArray()) {
      pCount[c - 'a']++;//abc
    }

    // Sliding window to count frequency of characters in s
    for (int i = 0; i < s.length(); i++) {
      sCount[s.charAt(i) - 'a']++;

      // Remove the character that is out of the window
      if (i >= p.length()) {
        sCount[s.charAt(i - p.length()) - 'a']--;
      }

      // Compare counts as jab same hue to h result m add
      if (Arrays.equals(pCount, sCount)) {
        result.add(i - p.length() + 1);
      }
    }
    return result;
    }
}
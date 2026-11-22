public class Solution {
    private Set<String> dict;
    private Map<String, List<String>> memo;

    private List<String> solve(String s) {
        if (s.isEmpty()) {//reming string h emty to complete
            return Arrays.asList("");
        }
        if (memo.containsKey(s)) {//memo check as dog ek bhri aya to jab jusri bhriaya to check krne k jazurat nhi h
            return memo.get(s);
        }

        List<String> result = new ArrayList<>();
        for (int l = 1; l <= s.length(); l++) {
            String currWord = s.substring(0, l);//cur k sar epossible prific check
            if (dict.contains(currWord)) {//cur dic m h
                String remainWord = s.substring(l);//cur k badd jo bacho uslo store kiya
                List<String> remainResult = solve(remainWord);//reming k possible find recursivly
                for (String w : remainResult) {
                    String toAdd = currWord + (w.isEmpty() ? "" : " ") + w;//emty h to no space else space add sord
                    result.add(toAdd);
                }
            }
        }
        memo.put(s, result);
        return result;
    }
    public List<String> wordBreak(String s, List<String> wordDict) {
        dict = new HashSet<>(wordDict);//dic k same word  hash set m store hongeh
        memo = new HashMap<>();//memoixation hash set banya
        return solve(s);//orignal string m recursion srt kiya
    }
}

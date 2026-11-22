public class Solution {
    private List<String> result;//sar evalid sentence storew
    private Set<String> dict;//dic k word store karga

    private void solve(int i, String currSentence, String s) {
        if (i >= s.length()) {//jab i string length equal so valid word bvnagya
            result.add(currSentence.trim());
            return;
        }

        for (int j = i; j < s.length(); j++) {
            String tempWord = s.substring(i, j + 1);//j+1 bcs java m endig indx incde

            if (dict.contains(tempWord)) {
                String originalSentence = currSentence;//curr k copy save kri
                if (!currSentence.isEmpty()) {
                    currSentence += " ";//emty h toh sapce add kro then snetnce
                }
                currSentence += tempWord;

                solve(j + 1, currSentence, s);

                currSentence = originalSentence;
            }
        }
    }

    public List<String> wordBreak(String s, List<String> wordDict) {
        result = new ArrayList<>();//final ans store
        dict = new HashSet<>(wordDict);//dic k word hoge hsdah set srch fats hoga

        String currSentence = "";
        solve(0, currSentence, s);//srt from 0

        return result;
    }
}

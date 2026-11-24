class Solution {
    List<String> result = new ArrayList<>();//store vlaid combinations

    public void solve(int idx, String digits, StringBuilder temp, HashMap<Character, String> mp) {

        if (idx >= digits.length()) {//idx rexhes length of digits
            result.add(temp.toString());
            return;
        }
        char ch = digits.charAt(idx);//get curr digit
        String str = mp.get(ch);

        for (int i = 0; i < str.length(); i++) {
            temp.append(str.charAt(i));//add selected chr to curr combination

            solve(idx + 1, digits, temp, mp);

            temp.deleteCharAt(temp.length() - 1);//undo as bcktrck remve chr w explor
        }
    }
    public List<String> letterCombinations(String digits) {
        if (digits.length() == 0) {//emty input
            return new ArrayList<>();
        }
        HashMap<Character, String> mp = new HashMap<>();
        mp.put('2', "abc");
        mp.put('3', "def");
        mp.put('4', "ghi");
        mp.put('5', "jkl");
        mp.put('6', "mno");
        mp.put('7', "pqrs");
        mp.put('8', "tuv");
        mp.put('9', "wxyz");

        StringBuilder temp = new StringBuilder();//emty string builder to store curr combinations

        solve(0, digits, temp, mp);
        return result;
    }
}
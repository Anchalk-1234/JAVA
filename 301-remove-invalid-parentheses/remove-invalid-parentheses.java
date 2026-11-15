class Solution {
    Set<String> set = new HashSet<>();//store valid strings

    public List<String> removeInvalidParentheses(String s) {
        int open = 0, close = 0;
        // Calculate minimum removals
        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                open++;
            }
            else if (ch == ')') {
                if (open > 0) {
                    open--;
                }
                else {
                    close++;
                }
            }
        }
        solve(s, 0, open, close, 0, new StringBuilder());//dfs xall lagyi

        List<String> result = new ArrayList<>(set);//copis elmt of haset to arrlist
        Collections.sort(result);

        return result;
    }

    public void solve(String s, int index, int open, int close,int count, StringBuilder path) {
        if (index == s.length()) {
            if (open == 0 && close == 0 && count == 0) {
                set.add(path.toString());//add sting tohash set
            }
            return;
        }
        char ch = s.charAt(index);//stoe curr char
        int len = path.length();//store curr length of string builder

        // Remove opening bracket
        if (ch == '(' && open > 0) {
            solve(s, index + 1, open - 1, close, count, path);
        }
        // Remove closing bracket
        if (ch == ')' && close > 0) {
            solve(s, index + 1, open, close - 1, count, path);
        }
        // Keep normal char
        if (ch != '(' && ch != ')') {
            path.append(ch);
            solve(s, index + 1, open, close, count, path);
        }
        else if (ch == '(') {//keep opng bracket
            path.append(ch);
            solve(s, index + 1, open, close, count + 1, path);
        }
        else if (count > 0) {//keep closing brackt
            path.append(ch);
            solve(s, index + 1, open, close, count - 1, path);
        }

        // Backtracking(it restorrs the privious length after exploring a choice)
        path.setLength(len);
    }
}

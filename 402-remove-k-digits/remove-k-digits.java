class Solution {
    public String removeKdigits(String num, int k) {
       Stack<Character> st = new Stack<>();//stack store char

        for (int i = 0; i < num.length(); i++) {
            char ch = num.charAt(i);
            while (!st.isEmpty() && k > 0 && st.peek() > ch) {//if elemnt in stack is  greter than curr so pop
                st.pop();
                k--;
            }
            st.push(ch);//or curr ko push
        }
        while (k > 0) {//ager 1234 yah 1111 so alredy non dec order m h toh top k elmt pop
            st.pop();
            k--;
        }
    
        StringBuilder ans = new StringBuilder();
        while (!st.isEmpty()) {
            ans.append(st.pop());//stack ka top elmt remove karke return then reverse
        }
        ans.reverse();
    
        while (ans.length() > 0 && ans.charAt(0) == '0') {//srt m 0s h 000100=100
            ans.deleteCharAt(0);
        }

        if (ans.length() == 0) {//if ans is empty return 0
       return "0";
         } else {
       return ans.toString();//convt strin gbulilde rto normal string
}
    }
}
    
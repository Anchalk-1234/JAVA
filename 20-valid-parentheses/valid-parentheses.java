class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();//create char stck

            for (char c : s.toCharArray()) {

              if (c == '(')//if find opening then put closing in stack
                stack.push(')');
              else if (c == '{')
                stack.push('}');
              else if (c == '[')
                stack.push(']');

              else if (stack.isEmpty() || stack.pop() != c)//if fid closing pop if same put t and if not false
                return false;
            }
            return stack.isEmpty(); 
    }
}
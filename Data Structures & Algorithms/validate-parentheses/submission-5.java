class Solution {
    public boolean isValid(String s) {
        Stack<Character> sta = new Stack<>();
        for(int i = 0; i < s.length(); i++)
        {
            if(s.charAt(i) == '[' || s.charAt(i) == '{' || s.charAt(i) == '(')
            {
                sta.push(s.charAt(i));
                continue;
            }
            if(sta.isEmpty())
            {
                return false;
            }
            else if(s.charAt(i) == ']' && sta.peek() == '[')
            {
                sta.pop();
                continue;
            }
            else if(s.charAt(i) == '}' && sta.peek() == '{')
            {
                sta.pop();
                continue;
            }
            else if(s.charAt(i) == ')' && sta.peek() == '(')
            {
                sta.pop();
                continue;
            }
            return false;
        }
        return sta.isEmpty();
    }
}

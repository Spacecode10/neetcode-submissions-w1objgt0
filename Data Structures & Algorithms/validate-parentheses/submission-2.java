class Solution {
    public boolean isValid(String s) {
        Stack<Character> sta = new Stack<>();
        for(int i = 0; i < s.length(); i++)
        {
            char c = s.charAt(i);
            if(sta.empty())
            {
                if(c == ')' || c == '}' || c == ']')
                {
                    return false;
                }
            }
            if(c == '(' || c == '{' || c == '[')
            {
                sta.push(c);
                continue;
            }
            if(c == ')' && sta.peek() != '(')
            {
                return false;
            }
            if(c == '}' && sta.peek() != '{')
            {
                return false;
            }
            if(c == ']' && sta.peek() != '[')
            {
                return false;
            }
            sta.pop();
        }
        if(sta.empty())
            return true;
        return false;
    }
}

class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        HashMap<Character, Integer> sMap = new HashMap<>();
        for(int i = 0; i < s.length(); i++)
        {
            sMap.put(s.charAt(i), sMap.getOrDefault(s.charAt(i),0)+1);
        }
        for(int i = 0; i < s.length(); i++)
        {
            int oc = sMap.getOrDefault(t.charAt(i),-1);
            if(oc <= 0)
            {
                return false;
            }
            sMap.put(t.charAt(i), --oc);
            if(oc == 0)
            {
                sMap.remove(t.charAt(i));
            }
        }
        if(sMap.isEmpty())
        {
            return true;
        }
        return false;
    }
}
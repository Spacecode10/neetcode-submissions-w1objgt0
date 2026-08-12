class Solution {

    private HashMap<String, Integer> memo;

    public int longestCommonSubsequence(String text1, String text2) {
        if (text1.equals(text2)) {
            return text1.length();
        }

        memo = new HashMap<>();

        if (text1.length() > text2.length()) {
            return dfs(text2, "", text1);
        } else {
            return dfs(text1, "", text2);
        }
    }

    public int dfs(String target, String p, String up) {

        if (up.length() == 0) {
            return isSubsequence(p, target) ? p.length() : 0;
        }

        String key = p + "|" + up;

        if (memo.containsKey(key)) {
            return memo.get(key);
        }

        int skip = dfs(target, p, up.substring(1));

        int take = dfs(
            target,
            p + up.charAt(0),
            up.substring(1)
        );

        int result = Math.max(skip, take);

        memo.put(key, result);

        return result;
    }

    private boolean isSubsequence(String p, String target) {
        int i = 0;

        for (int j = 0; j < target.length() && i < p.length(); j++) {
            if (p.charAt(i) == target.charAt(j)) {
                i++;
            }
        }

        return i == p.length();
    }
}
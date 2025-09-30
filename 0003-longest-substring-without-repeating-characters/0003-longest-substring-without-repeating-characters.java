import java.util.HashMap;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> charIndex = new HashMap<>();
        int maxLength = 0;
        int start = 0;

        for (int end = 0; end < s.length(); end++) {
            char c = s.charAt(end);
            if (charIndex.containsKey(c) && charIndex.get(c) >= start) {
                start = charIndex.get(c) + 1;
            }
            charIndex.put(c, end);
            maxLength = Math.max(maxLength, end - start + 1);
        }

        return maxLength;
    }
}

class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int len = 0;
        int start = 0;
        int end = 0;

        while ( end < s.length()) {
            char c = s.charAt(end);

            while(set.contains(c)){
                set.remove(s.charAt(start));
                start++;
            }

            set.add(c);
            len = Math.max(len, end - start +1);
            end++;
        }
        return len;
    }
}
class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) 
            return false;
            
        char[] chr1 = s.toCharArray();

        for(char c : chr1) {
            if(!t.contains(Character.toString(c))) {
                return false;
            }
        }
        return true;
    }
}
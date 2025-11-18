class Solution {
    public String solution(String myString, String pat) {
        int last = myString.lastIndexOf(pat) + pat.length();
        String result = myString.substring(0, last);
        
        return result;
    }
}
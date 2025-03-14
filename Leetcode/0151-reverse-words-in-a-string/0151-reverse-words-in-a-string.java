class Solution {
    public String reverseWords(String s) {
        String[] word = s.split("\\s+");
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<word.length; i++){
            sb.append(word[word.length-i-1]);
            sb.append(" ");
        }
        return sb.toString().trim();
    }

}
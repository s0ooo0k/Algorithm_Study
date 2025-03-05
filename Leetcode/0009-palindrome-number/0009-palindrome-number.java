class Solution {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        else {
            String xs = Integer.toString(x);
            int size = xs.length();
            for(int i=0; i<(size/2); i++){
                if(xs.charAt(i)!=xs.charAt(size-i-1)) return false;
            }
        }
        return true;
    }
}
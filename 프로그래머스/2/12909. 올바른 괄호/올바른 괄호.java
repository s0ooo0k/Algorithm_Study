import java.util.*;

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        ArrayDeque<Character> dq = new ArrayDeque<>();
        
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='(')
                dq.push('(');
            else if(s.charAt(i)==')' && dq.isEmpty()) 
                return false;
            else dq.pop();
        }
        // 끝나고 남아으면
        if(!dq.isEmpty()) {
            return false;
        }
        
        return true;
    }
}
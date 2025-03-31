// 12909 올바른 괄호

import java.util.ArrayDeque;
import java.util.Objects;

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        ArrayDeque<Character> stack = new ArrayDeque<>();
        for (int i=0; i<s.length(); i++){
            if (stack.size()==0 && s.charAt(i)==')')
                return answer=false;
            else if (s.charAt(i)=='('){
                stack.push(s.charAt(i));
            }
            else {
                stack.pop();
            }
        }
        if(stack.size()>0) answer=false;
        return answer;
    }
}
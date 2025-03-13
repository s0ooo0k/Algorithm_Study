import java.util.*;

class Solution {
    public String removeStars(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='*'){
                if(!stack.isEmpty()){
                    stack.pop();
                }
            }
            else {
                stack.push(s.charAt(i));
            }
        }
        StringBuilder answer = new StringBuilder();
        while(!stack.isEmpty()){
            answer.append(stack.pollLast());
        }
        return answer.toString();
    }
}
import java.util.*;
class Solution {
    public String solution(String my_string, int s, int e) {
        String sub1 = my_string.substring(0, s);
        StringBuffer sub2 = new StringBuffer(my_string.substring(s, e+1));
        sub2.reverse();
        String sub3 = my_string.substring(e+1, my_string.length());
        String answer = "";
        
        answer = sub1+sub2.toString()+sub3;
    
        return answer;
    }
}
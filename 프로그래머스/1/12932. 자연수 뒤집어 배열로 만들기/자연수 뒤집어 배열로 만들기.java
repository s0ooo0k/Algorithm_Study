import java.util.*;
class Solution {
    public int[] solution(long n) {
        
        
        StringBuilder str = new StringBuilder(String.valueOf(n)).reverse();

        char[] num = str.toString().toCharArray();
        int[] answer = new int[num.length];
        
        for(int i=0; i<num.length; i++){
            answer[i]=Integer.parseInt(String.valueOf(num[i]));
        }
        return answer;
    }
}
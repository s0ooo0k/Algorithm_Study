import java.util.*;
class Solution {
    public long solution(long n) {
        long answer = 0;
        String num = Long.toString(n);
        String[] number = num.split("");
        
        Arrays.sort(number, (a, b) -> b.compareTo(a));
        
        return Long.parseLong(String.join("", number));
    }
}
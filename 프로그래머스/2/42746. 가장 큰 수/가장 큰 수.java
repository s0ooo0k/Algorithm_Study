import java.util.*;
class Solution {
    public String solution(int[] numbers) {
        // 리스트 변환
        String[] num = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            num[i] = Integer.toString(numbers[i]);
        }
        
        // 절댓값 비교
        Arrays.sort(num, (a, b) -> (b+a).compareTo(a+b));
        if (num[0].equals("0")) return "0";

        return String.join("", num);
    }
}
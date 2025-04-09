import java.util.*;
class Solution {
    public String solution(int[] numbers) {
        // 문자열로 배열 저장
        String[] num = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            num[i] = Integer.toString(numbers[i]);
        }
        
        // 순서 비교
        Arrays.sort(num, (a, b) -> (b+a).compareTo(a+b));
        if (num[0].equals("0")) return "0";

        return String.join("", num);
    }
}
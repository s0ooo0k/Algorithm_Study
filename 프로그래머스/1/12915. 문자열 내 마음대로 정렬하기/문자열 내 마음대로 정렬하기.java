import java.util.*;
class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = {};
        
        Arrays.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2){
                if(s1.charAt(n)==s2.charAt(n)){
                    // 사전순 정렬
                    return s1.compareTo(s2); 
                } else {
                    // n번째 문자 비교
                    return Character.compare(s1.charAt(n), s2.charAt(n));
                }
            }
        });
        return strings;
    }
}
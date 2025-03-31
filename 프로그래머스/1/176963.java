// 176963 추억 점수

import java.util.*;
class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        Map<String, Integer> remember = new HashMap<>();
        int[] answer = new int[photo.length];
        
        for(int i=0; i<name.length; i++){
            remember.put(name[i], yearning[i]);
        }
        for(int i=0; i<photo.length; i++){
            int sum = 0;
            for(int j=0; j<photo[i].length; j++){
                if(remember.containsKey(photo[i][j])){
                    sum+=remember.get(photo[i][j]);
                }
                else {
                    sum+=0;
                }
            }
            answer[i]=sum;
        }
        return answer;
    }
}
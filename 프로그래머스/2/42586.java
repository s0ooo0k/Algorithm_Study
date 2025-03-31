// 42586 기능개발발

import java.util.ArrayDeque;
import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        ArrayDeque<Integer> q = new ArrayDeque<>();
        List<Integer> a = new ArrayList<>();
        int b=0, c=0, cnt=1;
        
        for(int i=0; i<progresses.length; i++){
            b = (int) Math.ceil((100.0 - progresses[i]) / speeds[i]);
            q.add(b);
        }
        
        b = q.pollFirst();
        if (q.isEmpty()) {  
            a.add(1);
            return new int[]{1};
        }
        
        while(!q.isEmpty()){
            c = q.pollFirst();
            
            if ( b >= c){
                cnt++;
                
            }
            else {
               a.add(cnt);
               cnt=1;
               b = c;
            }
            
            if (q.isEmpty()){
                break;
            }
            
        }
        a.add(cnt);
        
        System.out.println(a);
        int[] answer = new int[a.size()];
        for (int i = 0; i < a.size(); i++) {
            answer[i] = a.get(i); 
        }
        return answer;
    } 
}
import java.util.*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        int sum = 0;
        int i = 0; // 남은 트럭
        int time =0;
        
        Deque<Integer> bridge = new ArrayDeque<>();
        
        // 다리 길이만큼 초기화
        for(int j=0; j<bridge_length; j++) {
            bridge.offerLast(0);
        }
        
        while(i<truck_weights.length){
            time++; // 시간은 계속 1씩 증가
            
            // 제일 앞 트럭 이동
            int out = bridge.pollFirst();
            sum-=out;
            
            // 다음 무게 합이 weight 보다 작을 때
            if(sum+truck_weights[i] <= weight){
                bridge.offerLast(truck_weights[i]);
                sum+=truck_weights[i];
                i++;
            }
            
            // 10보다 클 때 (못올라감)
            else {
                bridge.offerLast(0);
            }
            
        }
        // 지금까지 걸린 시간 + 마지막 트럭 시간(다리 길이)
        return time+bridge_length;
    }
}
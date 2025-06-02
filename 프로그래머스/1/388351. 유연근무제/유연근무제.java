class Solution {
    public int solution(int[] schedules, int[][] timelogs, int startday) {
        int answer = 0;
        for(int i=0; i<timelogs.length; i++){
            int schedule = schedules[i];
            int h = schedule/100;
            int m = schedule%100+10;
            
            if(m>=60){
                h++;
                m-=60;
            }
            int come = h*100+m;
            int cnt=0;
            for(int j=0; j<7; j++){
                int day = (startday+j) % 7;
                if(day==6 || day==0)
                    continue;
                if(timelogs[i][j]<=come)
                    cnt++;
            }
            if(cnt==5) {
                answer++;
            }
            
        }
        return answer;
    }
}
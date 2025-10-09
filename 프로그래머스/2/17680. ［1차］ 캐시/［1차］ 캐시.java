import java.util.*;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        if(cacheSize==0) return cities.length*5;
        
        LinkedList<String> cache = new LinkedList<>();
        
        for(String c:cities) {
            c = c.toLowerCase();
            
            if(cache.contains(c)) {
                cache.remove(c);
                cache.offer(c);
                answer+=1;
            }
            else {
                if(cache.size() >= cacheSize) {
                    cache.poll();
                }
                cache.offer(c);
                answer+=5;
            }
        }
        return answer;
    }
}
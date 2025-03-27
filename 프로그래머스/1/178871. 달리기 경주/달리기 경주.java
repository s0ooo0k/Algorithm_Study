import java.util.*;
class Solution {
    public String[] solution(String[] players, String[] callings) {
        Map<String, Integer> map = new HashMap<>();
        
        for(int i=0; i<players.length; i++) {
            map.put( players[i], i);
        }
        
        for (String c : callings) {
            int index = map.get(c);
            
            String tmp = players[index-1];
            players[index-1] = players[index];
            players[index] = tmp;
            
            map.put(c, index-1);
            map.put(tmp, index);
        }
        
        return players;
    }
}
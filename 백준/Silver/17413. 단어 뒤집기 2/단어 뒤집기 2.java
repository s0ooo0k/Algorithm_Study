import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine(); 
        System.out.println(solution(str));
    }

    public static String solution(String str) {
        StringBuilder sb = new StringBuilder();
        Deque<Character> dq = new ArrayDeque<>();
        int tag = 0;

        for (int i = 0; i < str.length(); i++) {
            char s = str.charAt(i);
            
            // 괄호 안에서 태그 체크
            if (s == '<') {
                while (!dq.isEmpty())
                    sb.append(dq.pop());
                tag = 1;
                sb.append(s);
            }
            
            else if (s == '>') {
                tag = 0;
                sb.append(s);
            }
            
            // 괄호가 오면 뒤집기(< 안일 때는 어차피 dq 비어있음)
            else if (s==' '){
                while(!dq.isEmpty()){
                    sb.append(dq.pop());
                }
                sb.append(s);
            }
            
            // 괄호 안에서는 그냥 바로 append
            else if (tag == 1) {
                sb.append(s);
            }

            else {
                dq.push(s);
            }
        }
        
        while (!dq.isEmpty()) {
            sb.append(dq.pop());
        }
        return sb.toString();
    }
}

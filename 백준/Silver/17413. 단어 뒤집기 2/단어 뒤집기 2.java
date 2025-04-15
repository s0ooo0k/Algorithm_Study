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

            else if (s==' '){
                while(!dq.isEmpty()){
                    sb.append(dq.pop());
                }
                sb.append(s);
            }

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

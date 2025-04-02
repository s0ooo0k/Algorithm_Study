import java.io.*;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine(); 
        System.out.println(solution(str));      
    }

    static String solution(String str){
        String[] parts = str.split(" ");
        Set<String> check = Set.of("i", "pa", "te", "ni", "niti", "a", "ali", "nego", "no", "ili");

        StringBuilder sb = new StringBuilder();

        sb.append(parts[0].charAt(0));

        for(int i=1; i<parts.length; i++){
            if(!check.contains(parts[i])){
                sb.append(parts[i].charAt(0));
            }
        }
        return sb.toString().toUpperCase();
    }
}
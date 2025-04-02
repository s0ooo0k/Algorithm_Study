import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine(); 
        System.out.println(solution(str));      
    }

    static boolean solution(String str){
        int n = str.length();
         for(int i=0; i<n; i++){
            if(str.charAt(i)!=str.charAt(n-i-1))
                return false;
        }
        return true;
    }
}
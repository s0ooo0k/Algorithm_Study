import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        
        String[] par = {"<", ">", "&&", "||", "(", ")"};

        for(String p:par) {
            String re = " " + p + " ";
            s = s.replace(p, re);
        }

        String[] token = s.trim().split("\\s+");
        System.out.println(String.join(" ", token));
    }
}
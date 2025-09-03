import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        if(n==1) {
            System.out.println(br.readLine());
            return;
        }

        String[] file = new String[n];
        
        for(int i=0; i<n; i++) {
            file[i] = br.readLine();
        }

        System.out.println(pattern(file));
    }

    public static String pattern(String[] file) {
        char[] pat = file[0].toCharArray();
        int len = pat.length;

        for(int i=1; i<file.length; i++) {
            for(int j=0; j<len; j++) {
                if(pat[j]!='?' && pat[j]!=file[i].charAt(j)){
                    pat[j]='?';
                }
            }
        }
        return String.valueOf(pat);
    }
}
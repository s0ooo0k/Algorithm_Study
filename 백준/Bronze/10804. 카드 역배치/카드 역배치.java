import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] card = new int[21];

        for(int i=1; i<=20; i++) {
            card[i]=i;
        }

        for(int i=1; i<=10; i++) {
            String[] input = br.readLine().split(" ");
            int a = Integer.parseInt(input[0]);
            int b = Integer.parseInt(input[1]);
            split(card, a, b);
        }

        for(int i=1; i<=20; i++) {
            System.out.print(card[i]);
            System.out.print(" ");
        }
    }
    public static int[] split(int[] card, int a, int b) {
        int tmp;
        int mid = (a+b)/2;
        for(int i=a; i<=mid; i++) {
            tmp = card[i];
            card[i] = card[a+b-i];
            card[a+b-i]=tmp;
        }
        return card;
    }
}
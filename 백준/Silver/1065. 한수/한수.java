import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;

        for (int i = 1; i <= n; i++) {
            if (i < 100) {
                cnt++; 
            } else {
                int a = i / 100;
                int b = (i / 10) % 10;
                int c = i % 10;

                if ((a - b) == (b - c)) {
                    cnt++;
                }
            }
        }

        System.out.println(cnt);
    }
}
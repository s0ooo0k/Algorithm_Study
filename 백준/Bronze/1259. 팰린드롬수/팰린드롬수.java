import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(sc.hasNext()) {
            String str = sc.next();
            if(str.equals("0")) break;

            if(pal(str)) System.out.println("yes");
            else System.out.println("no");
        }
        sc.close();
    }
    public static boolean pal(String str) {
        int left=0;
        int right=str.length()-1;

        while(left<right) {
            if(str.charAt(left)!=str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        
        }
        return true;
    }
}
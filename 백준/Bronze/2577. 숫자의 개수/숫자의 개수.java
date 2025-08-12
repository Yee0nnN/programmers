import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt() * sc.nextInt() * sc.nextInt();
        sc.close();
        String str = Integer.toString(num);

        for (int i = 0; i < 10; i++) {
            int count = 0;
            char ch = (char) ('0' + i);
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == ch) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
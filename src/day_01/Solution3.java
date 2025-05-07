package day_01;

//03.문자열 반복해서 출력하기
import java.util.Scanner;

public class Solution3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int n = sc.nextInt();

		if (1 <= str.length() && str.length() <= 10 && 1 <= n && n <= 5) {
			for (int i = 1; i <= n; i++) {
				System.out.print(str);
			}
		}
	}
}
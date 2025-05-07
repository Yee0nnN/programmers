package day_01;

//04.대소문자 바꿔서 출력하기
import java.util.Scanner;

public class Solution4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();

		String result = "";
		if (1 <= str.length() && str.length() <= 20 && str.matches("[a-zA-Z]+")) {
			for (int i = 0; i < str.length(); i++) {
				char b = str.charAt(i);

				if (Character.isUpperCase(b)) {
					result += Character.toLowerCase(b);
				} else if (Character.isLowerCase(b)) {
					result += Character.toUpperCase(b);
				}
			}
			System.out.print(result);
		}
	}
}
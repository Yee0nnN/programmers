package day_01;

//01.문자열 출력하기
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();

		if (1 <= str.length() && str.length() <= 1000000 && !str.contains(" ")) {
			System.out.println(str);
		}
	}
}

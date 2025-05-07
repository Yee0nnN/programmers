package day_02;

import java.util.Scanner;

public class Solution3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();

		if (1 <= a.length() && a.length() <= 10) {
			for (int i = 0; i < a.length(); i++) {
				char b = a.charAt(i);
				System.out.println(b);
			}
		}
	}

}
package day_02;

import java.util.Scanner;

public class Solution4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		if (1 <= n && n <= 1000) {
			if (n % 2 == 0) {
				System.out.printf("%d is even", n);
			} else {
				System.out.printf("%d is odd", n);
			}
		}
	}
}

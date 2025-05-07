package day_15;

import java.util.Arrays;

class Solution4 {
	public int solution(int[] num_list) {
		int sum = 0;
		int mul = 1;

		for (int i = 0; i < num_list.length; i++) {
			if (num_list.length >= 11) {
				sum += num_list[i];
			} else {
				mul *= num_list[i];
			}
		}
		return (num_list.length >= 11) ? sum : mul;
	}

	public static void main(String[] args) {
		Solution4 s = new Solution4();
		System.out.println(s.solution(new int[] { 3, 4, 5, 2, 5, 4, 6, 7, 3, 7, 2, 2, 1 }));
	}
}

package day_13;

import java.util.Arrays;

class Solution4 {
	public int[] solution(int[] num_list, int n) {
		int[] answer = new int[n];

		int idx = 0;
		for (int i = 0; i < n; i++) {
			answer[idx++] = num_list[i];
		}
		return answer;
	}

	public static void main(String[] args) {
		Solution4 s = new Solution4();
		System.out.println(Arrays.toString(s.solution(new int[] { 2, 1, 6 }, 1)));
	}
}

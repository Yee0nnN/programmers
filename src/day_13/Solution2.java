package day_13;

import java.util.Arrays;

class Solution2 {
	public int[] solution(int[] num_list, int n) {
		int[] answer = new int[num_list.length];

		int idx = 0;

		for (int i = n; i < num_list.length; i++) {
			answer[idx] = num_list[i];
			idx++;
		}
		for (int i = 0; i < n; i++) {
			answer[idx] = num_list[i];
			idx++;
		}

		return answer;
	}

	public static void main(String[] args) {
		Solution2 s = new Solution2();
		System.out.println(Arrays.toString(s.solution(new int[] { 2, 1, 6 }, 1)));
	}
}

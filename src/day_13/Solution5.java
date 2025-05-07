package day_13;

import java.util.Arrays;

class Solution5 {
	public int[] solution(int[] num_list, int n) {
		int length = num_list.length / n;
		int[] answer = new int[num_list.length % n == 0 ? length : length + 1];

		int idx = 0;
		for (int i = 0; i < num_list.length; i += n) {
			answer[idx++] = num_list[i];
		}
		return answer;
	}

	public static void main(String[] args) {
		Solution5 s = new Solution5();
		System.out.println(Arrays.toString(s.solution(new int[] { 4, 2, 6, 1, 7, 6 }, 2)));
	}
}

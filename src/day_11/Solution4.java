package day_11;

import java.util.Arrays;

class Solution4 {
	public int[] solution(int start_num, int end_num) {
		int[] answer = new int[start_num - end_num+1];

		int idx = 0;
		for (int i = start_num; i >= end_num; i--) {
			answer[idx] = i;
			idx++;
		}

		return answer;
	}

	public static void main(String[] args) {
		Solution4 s = new Solution4();
		System.out.println(Arrays.toString(s.solution(10, 3)));
	}
}

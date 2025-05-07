package day_06;

import java.util.Arrays;

//01.마지막 두 원소
class Solution {
	public int[] solution(int[] num_list) {
		int[] answer = new int[num_list.length + 1];

		int a = num_list.length - 2;
		int b = num_list.length - 1;

		int result = 0;
		if (num_list[b] > num_list[a]) {
			result = num_list[b] - num_list[a];
		} else {
			result = num_list[b] * 2;
		}

		for (int i = 0; i < num_list.length; i++) {
			answer[i] = num_list[i];
		}

		answer[num_list.length] = result;

		return answer;
	}

	public static void main(String[] args) {
		Solution s = new Solution();
		System.out.println(Arrays.toString(s.solution(new int[] { 2, 1, 6 })));
		System.out.println(Arrays.toString(s.solution(new int[] { 5, 2, 1, 7, 5 })));
	}
}
